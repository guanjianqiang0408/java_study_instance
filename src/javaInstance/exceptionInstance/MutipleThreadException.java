package javaInstance.exceptionInstance;

class MyThread extends Thread{
    public void run(){
        System.out.println("This is my thread");
        throw new RuntimeException();
    }
}

public class MutipleThreadException {
    // 多线程异常
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            // 获取异常的堆栈信息
            e.printStackTrace();
        }
        System.out.println("Exiting main");
    }
}
