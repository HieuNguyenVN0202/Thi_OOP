package BaiTap5;

public class TestD {
    public static void main(String[] args) {
        Admin admin = new Admin("admin123", "admin@example.com", "adminpass");
        Customer customer = new Customer("user456", "user@example.com", "userpass");
        Moderator moderator = new Moderator("mod789", "moderator@example.com", "modpass");

        admin.login();
        admin.register();
        admin.logout();

        customer.register();
        customer.login();
        customer.logout();

        moderator.register();
        moderator.login();
        moderator.logout();
    }
}
