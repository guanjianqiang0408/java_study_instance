package javaInstance.networkInstance;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class GetURLResponseDate {
    // 获取 URL响应头的日期信息
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.runoob.com");
        HttpURLConnection hc = (HttpURLConnection) url.openConnection();
        long date = hc.getDate();
        Date responseDate = new Date(date);
        System.out.println(responseDate);
    }
}
