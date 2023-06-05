package JavaInstance.exceptionInstance;

public class MutipleExceptionFunction {
    // 多个异常处理
    public static void main(String[] args) {
        // 不推荐
        try{
            System.out.println();
        }catch (ArithmeticException e){
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        // 推荐
        try{
            System.out.println();
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
