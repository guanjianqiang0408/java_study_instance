package javaInstance.arrayInstance;

import java.util.Arrays;

public class ArraySortAndSearchElement {
    // 数组排序及元素查找
    public static void main(String[] args) {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        printArray("数组排序结果为", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("元素2在第" + index + "位");
    }
    public static void printArray(String message, int array[]){
        System.out.println(message + "[length: " + array.length + "]");
        for(int item: array){
            System.out.println(item);
        }
        System.out.println(" ");
    }
}
