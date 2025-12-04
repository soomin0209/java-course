package chapter2.interfaceexample.practice;

public class Computer implements Electronics {
    @Override
    public void turnOn() {
        System.out.println("컴퓨터가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터가 꺼졌습니다.");
    }

    void sleepMode() {
        System.out.println("절전 모드로 전환되었습니다.");
    }
}
