package JavaInstance.arrayInstance;

import java.util.Arrays;

public class EqualsArray {
    // 判断数组是否相等
    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,5,6};
        int [] a2 = {1,2,3,4,5,6};
        int [] a3 = {1,2,3,4};
        // equals 对比两个数组是否相等
        System.out.println(Arrays.equals(a1, a2));
        System.out.println(Arrays.equals(a1, a3));
        System.out.println(Arrays.equals(a2, a3));
    }
}
