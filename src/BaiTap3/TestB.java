package BaiTap3;

public class TestB {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red");
        Motorcycle myMotorcycle = new Motorcycle("Honda", "Blue");
        Truck myTruck = new Truck("Ford", "Green");

        myCar.start();
        myCar.accelerate();
        myCar.stop();

        myMotorcycle.start();
        myMotorcycle.accelerate();
        myMotorcycle.stop();

        myTruck.start();
        myTruck.accelerate();
        myTruck.stop();
    }
}
