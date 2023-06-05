package JavaInstance.fileOperateInstance;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOperate {
    // 文件写入
    public static void main(String[] args) {
        try{
            // 创建写入文件流
            BufferedWriter bw = new BufferedWriter(new FileWriter("./runoob.txt"));
            // 写入文件内容
            bw.write("菜鸟教程");
            // 关闭写入文件流
            bw.close();
            System.out.println("文件写入成功");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
