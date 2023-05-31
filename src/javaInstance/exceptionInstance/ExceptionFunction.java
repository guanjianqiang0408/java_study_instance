package javaInstance.exceptionInstance;

public class ExceptionFunction {
    // 异常处理方法
    public static void main(String[] args){
        try {
            int [] arr = new int[]{1 , 2, 3};
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
    }
}
