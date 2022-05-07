package project;

public class SignInUpShell {
    private final AccountService service = new AccountService();

    public static void main(String[] args) {
        SignInUpShell shell = new SignInUpShell();
        shell.start();
    }

    private void start() {
        join();
        login();
    }

    private void login() {
        String userId = "charlie";
        String password = "Password";

        LoginResult result = service.login(userId, password);
        if(!result.isLogged()){
            System.out.println("아이디나 비밀번호가 잘못됨.");
        } else {
            System.out.println(result.getName() + "님 로그인 성공!!");
        }
    }

    private void join() {
        String userId = "charlie";
        String password = "Password";
        String name = "chanYoungHong";
        int age = 29;
        long money = 0;
        int role = Account.ROLE_ADMIN;

        service.join(new JoinRequest(userId, password, name, age, money, role));
    }

}
