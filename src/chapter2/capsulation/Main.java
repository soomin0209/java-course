package chapter2.capsulation;

public class Main {

    public static void main(String[] args) {

        //생성자 호출
        Person person = new Person("Soomin");

        // 인스턴스 변수 접근
//        person.name = "Soomin";
//        person.secret = "??";

        // 인스턴스 메서드 접근
        person.methodA();
//        person.methodB();

        // 게터
//        String a = person.name;
        String name = person.getName();
        System.out.println("name = " + name);
        
        // 세터
        person.setName("Eunsung");
        String name2 = person.getName();
        System.out.println("name2 = " + name2);

    }
}
