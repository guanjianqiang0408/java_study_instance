package javaInstance.dataConsturctInstance;

import java.util.Collections;
import java.util.Vector;

public class GetVectorMaxValue {
    // 获取向量中最大的元素
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(101);
        v.add(1011);
        v.add(0);
        Object obj = Collections.max(v);
        System.out.println(obj);
    }
}
