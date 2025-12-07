package chapter3.thread.practice;

public class SingleThread {

    public long singleSum() {

        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
            System.out.println(sum);
            try {
                Thread.sleep(10);  // 0.01초 딜레이
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }
}
