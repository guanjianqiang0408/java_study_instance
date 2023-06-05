package JavaInstance.networkInstance;

import java.net.URL;

public class ParseURL {
    // 解析URL
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.runoob.com/html/html-tutorial.html");
        System.out.println("URL: " + url.toString());
        System.out.println("请求协议： " + url.getProtocol());
        System.out.println("文件名： " + url.getFile());
        System.out.println("主机名： " + url.getHost());
        System.out.println("路径： " + url.getPath());
        System.out.println("端口： " + url.getPort());
        System.out.println("默认端口： " + url.getDefaultPort());
    }
}
