package BaiTap2;

public class Cat extends Animal {

    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat say: meow meow...");
    }

    @Override
    public void move() {
        System.out.println("Cat is running...");
    }
}
