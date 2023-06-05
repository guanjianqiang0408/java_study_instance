package JavaInstance.methodInstance;

public class FibonaciiAlgorithmic {
    // 斐波那契数列算法
    public static void main(String[] args) {
        for(int count=0; count < 10; count++){
            System.out.printf("Fibonacci of %d is: %d\n", count, fibonacci(count));
        }
    }
    public static long fibonacci(long number){
        if ((number == 0) || (number == 1)) {
            // 第一位和第二位直接返回
            return number;
        } else {
            // 返回相邻位置的和
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
