package javaInstance.datetimeInstance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TranslationTimeStamp {
    // 时间戳转换
    public static void main(String[] args) {
        // 获取当前时间戳
        Long timestamp = System.currentTimeMillis();
        // 设置时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 时间戳转换为时间
        String formatResult = sdf.format(new Date(Long.parseLong(String.valueOf(timestamp))));
        System.out.println("格式化结果: " + formatResult);
    }
}
