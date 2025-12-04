package chapter2.classexample;

public class Person {

    // 1. 속성 - 변수 선언으로 표현 가능
    String name;
    int age;
    String address;

    // 2. 생성자 - 조립설명서
//    Person() {}   // 기본생성자
    // 생성자의 특징:
    // 1. 클래스와 이름이 같음
    // 2. 반환 타입 존재 X
    // 3. 여러 개 존재 가능
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. 기능(메서드 부분)
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // 게터 - 속성을 가져오는 기능
    String getName() {
        return this.name;
    }

    // 세터 - 속성을 설정해주는 기능
    void setAddress(String address) {
        this.address= address;
    }

}
