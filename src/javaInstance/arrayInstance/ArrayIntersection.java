package javaInstance.arrayInstance;

import java.util.ArrayList;

public class ArrayIntersection {
    // 数组交集
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
        arr1.retainAll(arr2);
        System.out.println("交集：" + arr1);
    }
}
