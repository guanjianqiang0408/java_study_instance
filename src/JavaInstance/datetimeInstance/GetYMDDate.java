package JavaInstance.datetimeInstance;

import java.util.Calendar;

public class GetYMDDate {
    // 获取时间年份月份等
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        // 天
        int day = cal.get(Calendar.DATE);
        // 月
        int month = cal.get(Calendar.MONTH) + 1;
        // 年
        int year = cal.get(Calendar.YEAR);
        // 一周中的第几天
        int weekDay = cal.get(Calendar.DAY_OF_WEEK);
        // 一月中的第九天
        int monthDay = cal.get(Calendar.DAY_OF_MONTH);
        // 一年中的第几天
        int yearDay = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        System.out.println(weekDay);
        System.out.println(monthDay);
        System.out.println(yearDay);
    }
}
