package javaInstance.arrayInstance;

import java.util.ArrayList;

public class ArrayDiffSet {
    // 数组差集
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        arr1.add(0, "c1");
        arr1.add(1, "c2");
        arr1.add(2, "c3");
        arr1.add(3, "c4");
        arr2.add(0, "c1");
        arr2.add(1, "c2");
        arr2.add(2, "c3");
        System.out.println("arr1: " + arr1);
        System.out.println("arr2: " + arr2);
        // 删除数组1中所有数组2中的元素内容
        arr1.removeAll(arr2);
        System.out.println("差集: " + arr1);
    }
}
