package chapter2.capsulation;

public class Person {

    // 속성
    private  String name;
    private String secret;

    // 생성자
//    public Person() {}
//    Person() {} // default -> 패키지 내부까지
    public Person(String name) {
        this.name = name;
    }

    // 기능
    public void methodA() {}
    private void methodB() {}

    // 일단 private으로 하고 필요한거 public으로

    // 게터
    public String getName() {
        return name;
    }

    //세터
    public void setName(String name) {
        this.name = name;
    }
}
