package JavaInstance.networkInstance;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public class GetURLResponseInfo {
    // 获取 URL 响应头信息
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.runoob.com");
        URLConnection uc = url.openConnection();
        Map headers = uc.getHeaderFields();
        Set<String> keys = headers.keySet();
        for(String k: keys){
            String v = uc.getHeaderField(k);
            System.out.println(k+":"+v);
        }
        System.out.println(uc.getLastModified());
    }
}
