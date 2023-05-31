package javaInstance.methodInstance;

public class ContinueUsed {
    // continue使用
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        for(int item: arr){
            if(item == 3){
                continue;
            }
            System.out.println(item);
        }
    }
}
