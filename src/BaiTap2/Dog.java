package BaiTap2;

public class Dog extends Animal {
    private String furType;

    public Dog(String name, int age, String furType) {
        super(name, age);
        this.furType = furType;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: woof woof");
    }

    @Override
    public void move() {
        System.out.println("Dog is running....");
    }
}
