package chapter3.thread.practice;

public class Main {

    public static void main(String[] args) {

        // 싱글 쓰레드
        System.out.println("::: 싱글 쓰레드 시작 :::");

        long singleStartTime = System.currentTimeMillis();  // 싱글 쓰레드 시작 시간

        SingleThread singleThread = new SingleThread();
        long singleSum = singleThread.singleSum();          // 싱글 쓰레드 합계

        long singleEndTime = System.currentTimeMillis();    // 싱글 쓰레드 종료 시간
        long singleTotalTime = singleEndTime - singleStartTime;  // 싱글 쓰레드 총 시간

        System.out.println("::: 싱글 쓰레드 종료 :::");
        System.out.println();

        System.out.println("싱글 쓰레드 합계: " + singleSum);
        System.out.println("싱글 쓰레드 소요 시간: " + singleTotalTime + "ms");
        System.out.println("\n");

        // 멀티 쓰레드
        System.out.println("::: 멀티 쓰레드 시작 :::");

        long multiStartTime = System.currentTimeMillis();

        MultiThread task0 = new MultiThread(1, 250);
        MultiThread task1 = new MultiThread(251, 500);
        MultiThread task2 = new MultiThread(501, 750);
        MultiThread task3 = new MultiThread(751, 1000);

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();

        try {   // main 쓰레드 대기
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long sum0 = task0.getSum();
        long sum1 = task1.getSum();
        long sum2 = task2.getSum();
        long sum3 = task3.getSum();
        long multiSum = sum0 + sum1 + sum2 + sum3;  // 멀티 쓰레드 합계

        long multiEndTime = System.currentTimeMillis();    // 멀티 쓰레드 종료 시간
        long multiTotalTime = multiEndTime - multiStartTime;  // 멀티 쓰레드 총 시간

        System.out.println("::: 멀티 쓰레드 종료 :::");
        System.out.println();

        System.out.println("멀티 쓰레드 합계: " + multiSum);
        System.out.println("멀티 쓰레드 소요 시간: " + multiTotalTime + "ms");
        System.out.println();

        System.out.println("싱글 쓰레드: " + singleTotalTime + "ms, 멀티 쓰레드: " + multiTotalTime + "ms");
        System.out.println("차이: " + (singleTotalTime - multiTotalTime) + "ms");
    }
}
