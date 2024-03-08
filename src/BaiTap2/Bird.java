package BaiTap2;

public class Bird extends Animal {
    private String birdType;

    public Bird(String name, int age, String birdType) {
        super(name, age);
        this.birdType = birdType;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: chip chip...");
    }

    @Override
    public void move() {
        System.out.println("Bird is flying...");
    }
}
