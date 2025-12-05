package chapter3.exception.practice;

public class Login {

    public void LoginException(String id, String pw) {

        try {
            if (!id.equals("admin") || !pw.equals("1234")) {
                throw new Exception("로그인 실패");
            }

            System.out.println("로그인 성공");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
