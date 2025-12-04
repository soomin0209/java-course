package chapter2.polymorphism;

public class Main {

    public static void main(String[] args) {
        // 다형성 활용
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.makeSound();

        animal2.exist();
        animal2.makeSound();

        // 업캐스팅 주의사항
//        animal1.scratch();
//        animal2.wag();

        // 다운캐스팅
        Cat cat = (Cat) animal1;
        cat.scratch();

        Dog dog = (Dog) animal2;
        dog.wag();

        // 잘못된 다운캐스팅
//        Cat cat2 = (Cat) animal2;   // animal2 = Dog
//        cat2.scratch();

        // 다운캐스팅 시 instanceof 활용 방법
        if (animal1 instanceof Cat) {
            Cat cat2 = (Cat) animal1;
        } else {
            System.out.println("객체가 고양이가 아닙니다.");
        }

        Animal[] animals = {new Cat(), new Dog(), new Cat()};
        System.out.println("::::");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
