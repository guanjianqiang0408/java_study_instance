package javaInstance.arrayInstance;

import java.util.Arrays;

public class DelArrayElement {
    // 删除数组元素
    public static void main(String[] args) {
        // 旧数组
        int [] oldArray = new int[] {3, 4, 5, 6, 7};
        // 新数组用于存储非过滤的元素内容
        int [] newArray = new int[oldArray.length-1];
        // 删除元素的索引位
        int delIndex = 2;
        for(int index=0; index<newArray.length; index++){
            if(delIndex<0 || delIndex>oldArray.length){
                throw new RuntimeException("元素下标越界");
            }
            if(index < delIndex){
                newArray[index] = oldArray[index];
            }else{
                newArray[index] = oldArray[index + 1];
            }
        }
        System.out.println(Arrays.toString(oldArray));
        oldArray = newArray;
        System.out.println(Arrays.toString(oldArray));
    }
}
