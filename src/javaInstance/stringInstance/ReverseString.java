package javaInstance.stringInstance;

public class ReverseString {
    // 反转字符串
    public static void main(String[] args) {
        String str = "runoob";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("反转前字符串内容: " + str);
        System.out.println("反转后字符串内容: " + reverse);
    }
}
