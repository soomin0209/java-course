package chapter3.exception.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("아이디를 입력하세요: ");
                String id = scanner.nextLine();
                System.out.print("비밀번호를 입력하세요: ");
                String pw = scanner.nextLine();

                Login login = new Login();
                login.LoginException(id, pw);

                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
