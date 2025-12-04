package chapter2.polymorphism.practice;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    public void scratch() {
        System.out.println("긁긁");
    }
}
