package BaiTap2;

public class TestA {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy",3,"Short fur");
        dog.makeSound();
        dog.move();

        Cat cat = new Cat("Whiskers",2,"White");
        cat.makeSound();
        cat.move();

        Bird bird = new Bird("Robin",4,"Sparrow");
        bird.makeSound();
        bird.move();
    }
}
