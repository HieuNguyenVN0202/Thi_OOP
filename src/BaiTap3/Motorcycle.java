package BaiTap3;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle engine started...");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is revving...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped...");
    }
}
