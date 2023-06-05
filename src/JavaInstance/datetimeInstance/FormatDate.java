package JavaInstance.datetimeInstance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    // 格式化时间
    public static void main(String[] args) {
        // 创建时间对象
        Date date = new Date();
        // 声明时间格式
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        // 创建时间格式化对象SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        // 格式化时间
        System.out.println(sdf.format(date));
    }
}
