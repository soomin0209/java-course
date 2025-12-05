package chapter3.lambda;

@FunctionalInterface // 하나의 추상 메서드만 가질 수 있음
public interface Calculator {

    int sum(int a, int b);
}
