package chapter2.capsulation.v1;

// 핵 시설 관리하는 개발자
public class DataStore {
// "B" 문자열이 들어오면 핵폭발 발생 !!
    private String store;

    public void setStore(String store) {
        if (store.equals("B")) {    // 무분별한 세터 방지
            System.out.println("B가 입력되면 안됩니다.");
        } else {
            this.store = store;
        }
    }
}
