package BaiTap5;

public class Moderator extends User {
    public Moderator(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Moderator logged in.");
    }

    @Override
    public void register() {
        System.out.println("Moderator registered.");
    }

    @Override
    public void logout() {
        System.out.println("Moderator logged out.");
    }
}
