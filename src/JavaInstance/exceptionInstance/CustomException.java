package JavaInstance.exceptionInstance;

// 自定义异常类 继承自Exception
class WrongInputException extends Exception{
    WrongInputException(String s){
        super(s);
    }
}


class Input{
    void method() throws WrongInputException{
        throw new WrongInputException("【CustomException】wrong input");
    }
}


public class CustomException {
    // 自定义异常
    public static void main(String[] args) {
        try{
            new Input().method();
        }catch (WrongInputException e){
            System.out.println(e.getMessage());
        }
    }
}
