package chapter3.exception.practice;

public class Login {

    public void LoginException(String id, String pw) throws Exception {

        if (!id.equals("admin") || !pw.equals("1234")) {
            throw new Exception("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다. ");
        } else {
            System.out.println("로그인 성공");
        }
    }
}
