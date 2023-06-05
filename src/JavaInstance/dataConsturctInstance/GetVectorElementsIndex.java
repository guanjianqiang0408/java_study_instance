package JavaInstance.dataConsturctInstance;

import java.util.Collections;
import java.util.Vector;

public class GetVectorElementsIndex {
    // 获取向量元素索引
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, 2);
        System.out.println(index);
    }
}
