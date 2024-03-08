package BaiTap3;

public class Truck extends Vehicle {

    public Truck(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck is picking up speed.");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped.");
    }
}
