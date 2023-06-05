package JavaInstance.exceptionInstance;

public class LinkTypeException {
    // 链式异常（异常嵌套）
    public static void main(String[] args) {
        int n=20, result=0;
        try{
            result = n/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("发生算数异常");
            try{
                throw new NumberFormatException();
            }catch (NumberFormatException e1){
                System.out.println("手动抛出链式异常：" + e1);
            }
        }
    }
}
