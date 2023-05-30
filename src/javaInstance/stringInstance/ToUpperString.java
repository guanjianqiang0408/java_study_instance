package javaInstance.stringInstance;

public class ToUpperString {
    // 字符串小写转大写
    public static void main(String[] args) {
        String string = "abcdefg";
        // 转大写
        String upperString = string.toUpperCase();
        System.out.println(upperString);
        // 转小写
        String lowerString = upperString.toLowerCase();
        System.out.println(lowerString);
    }
}
