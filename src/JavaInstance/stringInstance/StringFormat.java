package JavaInstance.stringInstance;

import java.util.Locale;

public class StringFormat {
    // 格式化字符串
    public static void main(String[] args) {
        double e = Math.E;
        // %f float字符串占位符 %n 换行符
        System.out.format("%f%n", e);
        System.out.format(Locale.CHINA, "%-10.4f", e);
    }
}
