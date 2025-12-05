package chapter3.generic;

public class GenericBox<T> {
    // 속성
    private T item;

    // 생성자
    public GenericBox(T item) {
        this.item = item;
    }

    // 기능
    public T getItem() {
        return this.item;
    }

    // 컴파일 실행되면 T -> Object 변경

    // 일반 메서드
    public void printItem(T item) {
        System.out.println(item);
    }

    // 제네릭 메서드
    public <S> void printBoxItem(S itme) {
        System.out.println(itme);
    }
}
