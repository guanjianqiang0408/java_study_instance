package javaInstance.stringInstance;

// 字符串对比
public class StringCompare {
    public static void main(String[] args) {

        String str = "Hello World";
        String anotherStr = "hello world";
        // 对比字符串
        System.out.println(str.compareTo(anotherStr));
        // 对比字符串忽略大小写
        System.out.println(str.compareToIgnoreCase(anotherStr));
    }
}
