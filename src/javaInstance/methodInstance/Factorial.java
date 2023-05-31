package javaInstance.methodInstance;

public class Factorial {
    // 阶乘
    public static void main(String[] args) {
        for(int count=0; count < 10; count++){
            System.out.println(count + "!=" + factorial(count) + "\n");
        }
    }
    public static long factorial(long number){
        if (number < 1){
            return 1;
        }else{
            return number * factorial(number - 1 );
        }
    }
}
