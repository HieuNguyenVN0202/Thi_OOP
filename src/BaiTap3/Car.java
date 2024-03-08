package BaiTap3;

public class Car extends Vehicle {

    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Car engine started...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is speeding up...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped...");
    }
}
