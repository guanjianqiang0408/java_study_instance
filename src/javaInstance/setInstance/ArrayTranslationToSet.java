package javaInstance.setInstance;

import java.util.Arrays;
import java.util.List;

public class ArrayTranslationToSet {
    // 数组转集合
    public static void main(String[] args) {
        String [] name = new String[5];
        // 向数组添加元素
        for(int index=0; index<name.length; index++){
            name[index] = String.valueOf(index);
        }
        // 数组转集合
        List<String> list = Arrays.asList(name);
        for(String item: list){
            System.out.println(item);
        }
    }
}
