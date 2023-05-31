package javaInstance.methodInstance;

public class VarargsParmetersUsed {
    // Varargs可变参数使用  ... 表示可变参数， 要声明可变参数类型
    static int sumvarargs(int... intArrays){
        int sum, index;
        sum = 0;
        for(index=0; index<intArrays.length; index++){
            sum += intArrays[index];
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = 0;
        // new int[]{} 等于 int[]arr = {}
        sum = sumvarargs(new int[]{10,20,30});
        System.out.println(sum);
    }
}
