package chapter2.polymorphism.practice;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.makeSound();

        animal2.exist();
        animal2.makeSound();

        // 다운 캐스팅
        Cat cat = (Cat) animal1;
        cat.scratch();

        Dog dog = (Dog) animal2;
        dog.wag();

        // instanceof 활용
        if (animal2 instanceof Cat) {
            Cat cat2 = (Cat) animal2;
        }else {
            System.out.println("고양이가 아닙니다.");
        }
    }
}
