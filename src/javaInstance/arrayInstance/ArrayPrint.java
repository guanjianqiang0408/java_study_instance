package javaInstance.arrayInstance;

public class ArrayPrint {
    // 数组输出
    public static void main(String[] args) {
        String [] array = new String[3];
        array[0] = "baidu";
        array[1] = "google";
        array[2] = "bing";
        for(int i=0; i<array.length; i ++){
            System.out.println(array[i]);
        }
        for(String item: array){
            System.out.println(item);
        }
    }
}
