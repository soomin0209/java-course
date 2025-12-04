package chapter2.polymorphism.practice;

abstract class Animal extends LifeForm {

    @Override
    public void exist() {
        System.out.println("동물은 존재합니다.");
    }

    public void makeSound() {
        System.out.println("동물은 소리를 냅니다");
    }
}
