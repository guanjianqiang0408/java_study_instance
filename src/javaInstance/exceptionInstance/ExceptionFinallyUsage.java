package javaInstance.exceptionInstance;

public class ExceptionFinallyUsage {
    // Finally 用法
    public static void main(String[] args) {
        try{
            System.out.println("DoSomethings");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("Must execute once code");
        }
    }
}
