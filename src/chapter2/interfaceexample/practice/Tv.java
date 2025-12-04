package chapter2.interfaceexample.practice;

public class Tv implements Electronics {
    @Override
    public void turnOn() {
        System.out.println("TV가 켜졌습니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV가 꺼졌습니다.");
    }

    // 확장 기능
    void changeChannel() {
        System.out.println("채널이 변경되었습니다.");
    }
}
