package JavaInstance.arrayInstance;

import java.util.ArrayList;

public class SearchArrayElements {
    // 找到数组中的指定元素
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        System.out.println("objArray 的数组元素："+objArray);
        System.out.println("objArray2 的数组元素："+objArray2);
        // 判断数组中是否有指定元素
        System.out.println("objArray 是否包含字符串common2? ： " + objArray.contains("common2"));
    }
}
