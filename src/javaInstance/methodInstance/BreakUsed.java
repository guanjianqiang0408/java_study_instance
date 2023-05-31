package javaInstance.methodInstance;

public class BreakUsed {
    // break使用
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        for(int item: array){
            if(item==3){
                break;
            }
            System.out.println(item);
        }
    }
}
