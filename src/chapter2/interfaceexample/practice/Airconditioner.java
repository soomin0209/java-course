package chapter2.interfaceexample.practice;

public class Airconditioner implements Electronics {
    @Override
    public void turnOn() {
        System.out.println("에어컨이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨이 꺼졌습니다.");
    }

    // 확장 기능
    void dehumidification() {
        System.out.println("제습 모드로 전환합니다.");
    }
}
