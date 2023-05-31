package javaInstance.dataConsturctInstance;

public class NumberSumOperation {
    // 数字求和运算0~100
    public static void main(String[] args) {
        int limit=100, sum=0, iter=1;
        do{
            sum += iter;
            iter++;
        }while(iter<limit);
        System.out.println(sum);
    }
}
