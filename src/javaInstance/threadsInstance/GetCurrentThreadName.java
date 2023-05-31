package javaInstance.threadsInstance;

public class GetCurrentThreadName extends Thread{
    // 获取当前线程名称
    public void run(){
        for(int i=0; i<10; i++){
            printMsg();
        }
    }
    void printMsg(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("thread name: " + name);
    }

    public static void main(String[] args) {
        GetCurrentThreadName t = new GetCurrentThreadName();
        t.start();
        for(int i=0; i<10; i++){
            t.printMsg();
        }
    }
}
