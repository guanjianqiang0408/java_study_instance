package javaInstance.datetimeInstance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDate {
    // 获取当前时间
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        Date date = new Date();
        System.out.println("当前时间:" + sdf.format(date));
    }
}
