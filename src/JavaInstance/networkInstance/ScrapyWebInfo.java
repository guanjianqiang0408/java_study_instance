package JavaInstance.networkInstance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class ScrapyWebInfo {
    // 网页抓取
    public static void main(String[] args) throws  Exception{
        // 创建网页连接对象
        URL url = new URL("http://www.runoob.com");
        // 创建数据读取流
        BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
        // 创建数据写入流
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.html"));
        String line;
        while((line = bf.readLine()) != null){
            System.out.println(line);
            bw.write(line);
            bw.newLine();
        }
        bf.close();
        bw.close();
    }
}
