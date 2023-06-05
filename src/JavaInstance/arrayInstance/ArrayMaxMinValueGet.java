package JavaInstance.arrayInstance;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxMinValueGet {
    // 数组最大最小值获取
    public static void main(String[] args) {
        Integer[]array = {8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(array));
        System.out.println("最小值: " + min);
        int max = (int) Collections.max(Arrays.asList(array));
        System.out.println("最大值: " + max);
    }
}
