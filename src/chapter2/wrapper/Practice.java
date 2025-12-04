package chapter2.wrapper;

public class Practice {

    public static void main(String[] args) {
        int iteration = 10_000_000; // 1000만 번 반복

        // 기본형 double 연산 성능 테스트
        long startTime1 = System.nanoTime();
        double sum1 = 0.0;
        for (int i = 0; i < iteration; i++) {
            sum1 += i * 1.1;  // 기본형 연산
        }
        long endTime1 = System.nanoTime();
        long primitiveTime = endTime1 - startTime1;

        // MyDouble 연산 성능 테스트
        long startTime2 = System.nanoTime();
        MyDouble sum2 = new MyDouble(0.0);
        for (int i = 0; i < iteration; i++) {
            sum2 = sum2.add(new MyDouble(i * 1.1));  // 오토박싱 & 언박싱 발생
        }
        long endTime2 = System.nanoTime();
        long myDoubleTime = endTime2 - startTime2;

        // 결과 출력
        System.out.println("기본형(double) 연산 시간: " + primitiveTime + " ns");
        System.out.println("MyDouble 클래스 연산 시간: " + myDoubleTime + " ns");
        System.out.println("성능 차이: " + (double) myDoubleTime / primitiveTime);
    }
}
