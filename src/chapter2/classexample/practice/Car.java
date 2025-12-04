package chapter2.classexample.practice;

public class Car {

    // 속성
    String name;
    String model;

    // 생성자
    Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    // 기능
    void drive() {
        System.out.println(this.name + " - " + this.model + ": 주행");
    }

    void accelerate() {
        System.out.println(this.name + " - " + this.model + ": 가속");
    }
}
