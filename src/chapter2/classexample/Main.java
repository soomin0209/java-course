package chapter2.classexample;

public class Main {

    public static void main(String[] args) {

        // 객체 생성(인스턴스화)
        Person personA = new Person("Soomin", 25);
        Person personB = new Person("Eunsung", 24);

        //속성에 직접 접근
//        System.out.println("설정 전 personA의 이름: " + personA.name);
//        System.out.println("설정 전 personB의 이름: " + personB.name);
//        personA.name = "Soomin";
//        personB.name = "Eunsung";
//        System.out.println("설정 후 personA의 이름: " + personA.name);
//        System.out.println("설정 후 personB의 이름: " + personB.name);

        int result1 = personA.sum(1, 2);
        int result2 = personB.sum(2, 4);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        String name = personB.getName();
        System.out.println("name = " + name);

        System.out.println("personA의 주소: " + personA.address);
        personA.setAddress("가평");
        System.out.println("personA의 주소: " + personA.address);
    }
}
