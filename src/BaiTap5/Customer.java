package BaiTap5;

public class Customer extends User {
    public Customer(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Customer logged in.");
    }

    @Override
    public void register() {
        System.out.println("Customer registered.");
    }

    @Override
    public void logout() {
        System.out.println("Customer logged out.");
    }
}
