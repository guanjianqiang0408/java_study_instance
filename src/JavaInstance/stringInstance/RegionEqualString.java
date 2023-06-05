package JavaInstance.stringInstance;

public class RegionEqualString {
    // 字符串区域相等比较
    public static void main(String[] args) {
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
        // 普通比较
        boolean matchOne = first_str.regionMatches(11, second_str, 12, 9);
        // 忽略大小写比较
        boolean matchTwo = first_str.regionMatches(true, 11, second_str, 12, 9);
        System.out.println("区分大小写对比结果： " + matchOne);
        System.out.println("不区分大小写对比结果: " + matchTwo);
    }
}
