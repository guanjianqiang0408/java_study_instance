package javaInstance.dataConsturctInstance;

import java.util.Collections;
import java.util.Vector;

public class SwapVector {
    // 向量旋转
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        System.out.println(v);
        Collections.swap(v, 0, 4);
        System.out.println(v);
    }
}
