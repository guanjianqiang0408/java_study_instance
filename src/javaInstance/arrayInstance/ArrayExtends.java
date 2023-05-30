package javaInstance.arrayInstance;

public class ArrayExtends {
    // 数组扩容
    public static void main(String[] args) {
        String [] name = {"tom", "jack"};
        String [] extended = new String[4];
        extended[2] = "zhangsan";
        extended[3] = "lisi";
        // 扩容extended数组
        System.arraycopy(name, 0, extended, 0, name.length);
        for(String item: extended){
            System.out.println(item);
        }
    }
}
