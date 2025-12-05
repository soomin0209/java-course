package chapter3.thread.practice;

public class MultiThread implements Runnable{

    private int start;
    private int end;
    private long sum = 0;

    public MultiThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = this.start; i <= this.end; i++) {
            this.sum += i;
            System.out.println(threadName + " - " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public long getSum() {
        return this.sum;
    }
}
