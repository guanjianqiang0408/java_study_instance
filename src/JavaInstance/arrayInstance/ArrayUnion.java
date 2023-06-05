package JavaInstance.arrayInstance;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUnion {
    // 数组拼接
    public static void main(String[] args) {
        String [] a = { "a", "b", "c"};
        String [] b = { "d", "e", "f"};
        // 创建列表并初始值为数组a
        List<String> list = new ArrayList<>(Arrays.asList(a));
        // 添加b数组到列表
        list.addAll(Arrays.asList(b));
        // 列表转数组
        Object [] c = list.toArray();
        // 数组转字符串，并输出
        System.out.println(Arrays.toString(c));
    }
}
