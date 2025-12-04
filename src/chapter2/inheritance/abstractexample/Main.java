package chapter2.inheritance.abstractexample;

public class Main {

    public static void main(String[] args) {
        // 추상 클래스 인스턴스화 불가
//        Animal animal = new Animal();
        Cat cat = new Cat();
        cat.name = "zero";
        cat.sleep();

        // 자식에서 강제 구현된 메서드
        cat.eat();
    }
}
