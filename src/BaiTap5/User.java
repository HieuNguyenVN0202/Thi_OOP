package BaiTap5;

abstract class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public abstract void login();
    public abstract void register();
    public abstract void logout();
}
