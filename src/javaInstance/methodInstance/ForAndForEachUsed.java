package javaInstance.methodInstance;

public class ForAndForEachUsed {
    // for  foreach循环使用
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        // for 循环
        for(int index=0; index<arr.length; index++){
            System.out.println(arr[index]);
        }
        // foreach循环
        for(int item: arr){
            System.out.println(item);
        }
    }
}
