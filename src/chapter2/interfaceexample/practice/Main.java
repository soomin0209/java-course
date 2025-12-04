package chapter2.interfaceexample.practice;

public class Main {

    public static void main(String[] args) {

        // 객체 생성
        Tv tv = new Tv();
        Airconditioner airConditioner = new Airconditioner();
        Computer computer = new Computer();

        // TV
        tv.turnOn();
        tv.turnOff();
        tv.changeChannel();

        System.out.println();

        // 에어컨
        airConditioner.turnOn();
        airConditioner.turnOff();
        airConditioner.dehumidification();

        System.out.println();

        // 컴퓨터
        computer.turnOn();
        computer.turnOff();
        computer.sleepMode();

    }
}
