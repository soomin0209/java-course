package chapter2.wrapper.practice;

public class MyDouble {
    // 1. 속성
    double value;

    // 2. 생성자
    MyDouble(double value) {
        this.value = value;
    }

    // 3. 기능 - 자동으로 문자열로 변환해주는 기능
    // toString() 오버라이딩 (값을 출력할 수 있도록)
    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public MyDouble add(MyDouble other) {
        return new MyDouble(this.value + other.value);
    }
}
