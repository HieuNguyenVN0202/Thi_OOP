package BaiTap5;

public class Admin extends User {
    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Admin logged in.");
    }

    @Override
    public void register() {
        System.out.println("Admin registered.");
    }

    @Override
    public void logout() {
        System.out.println("Admin logged out.");
    }
}
