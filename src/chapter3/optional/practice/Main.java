package chapter3.optional.practice;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CampService campService = new CampService();

        System.out.print("학생 이름을 입력하세요: ");
        String name = scanner.nextLine();

        Optional<Student> studentOptional = campService.findStudent(name);
        boolean flag = studentOptional.isPresent();
        if (flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("캠프에 " + studentName + " 학생이 존재합니다.");
        } else {
            System.out.println("캠프에 해당 학생이 존재하지 않습니다.");
        }
    }
}
