package JavaInstance.arrayInstance;

public class ArrayReverse {
    // 数组反转
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50};
        for(int i=array.length-1; i >= 0; i --){
            System.out.println(array[i]);
        }
    }
}
