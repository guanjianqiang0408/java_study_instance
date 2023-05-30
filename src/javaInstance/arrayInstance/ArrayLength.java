package javaInstance.arrayInstance;

public class ArrayLength {
    // 获取数组长度
    public static void main(String[] args) {
        String [][] data = new String[2][5];
        System.out.println("第一个数组的长度 " + data.length);
        System.out.println("第二个数组的长度 " + data[0].length);
    }
}
