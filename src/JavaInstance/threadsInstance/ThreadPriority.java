package JavaInstance.threadsInstance;

public class ThreadPriority extends Thread {
    // 线程优先级
    private int countDown = 5;
    private volatile double d = 0;
    public ThreadPriority(int priority) {
        // 设置优先级
        setPriority(priority);
        start();
    }
    public String toString() {
        return super.toString() + ": " + countDown;
    }
    public void run() {
        while(true) {
            for(int i = 1; i < 100000; i++)
                d = d + (Math.PI + Math.E) / (double)i;
            System.out.println(this);
            if(--countDown == 0) return;
        }
    }
    public static void main(String[] args) {
        new ThreadPriority(Thread.MAX_PRIORITY);
        for(int i = 0; i < 5; i++){
            new ThreadPriority(Thread.MIN_PRIORITY);
        }
    }

}
