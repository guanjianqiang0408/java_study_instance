package JavaInstance.arrayInstance;

public class FindArrayRepeatElements {
    // 查找数组重复元素
    public static void main(String[] args) {
        int [] numbers = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
        findDupicateInArray(numbers);
    }
    public static void findDupicateInArray(int [] array){
        // 使用冒泡排序方式进行元素遍历对比
        int count = 0;
        for(int outIndex=0; outIndex<array.length; outIndex++){
            for(int innerIndex=outIndex+1; innerIndex<array.length; innerIndex++){
                if(array[outIndex] == array[innerIndex]){
                    count ++;
                }
            }
            if(count == 1 ){
                System.out.println("重复元素: " + array[outIndex]);
            }
            count = 0;
        }
    }
}
