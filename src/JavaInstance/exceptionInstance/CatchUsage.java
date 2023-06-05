package JavaInstance.exceptionInstance;

public class CatchUsage {
    // Catch处理异常
    public static void main(String[] args) {
        try{
            int[]arr = new int[]{1,2,3};
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
