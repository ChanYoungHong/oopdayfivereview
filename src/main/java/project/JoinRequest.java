package project;

public class JoinRequest {
    private String userId;
    private String password;
    private String name;
    private int age;
    private long money;
    private int role;

    public JoinRequest(String userId, String password, String name, int age, long money, int role) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.money = money;
        this.role = role;
    }
}
