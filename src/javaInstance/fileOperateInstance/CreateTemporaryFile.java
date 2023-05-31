package javaInstance.fileOperateInstance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTemporaryFile {
    // 创建临时文件
    public static void main(String[] args) throws IOException {
        // 参数1 文件前缀  参数2 文件后缀
        File temp = File.createTempFile("temporary", ".txt");
        System.out.println("临时文件路径: " + temp.getAbsolutePath());
        // 如果临时文件被删除，退出停止后续任务
        temp.deleteOnExit();
        BufferedWriter bf = new BufferedWriter(new FileWriter(temp));
        bf.write("this is temporary file create");
        System.out.println("临时文件创建成功");
        bf.close();
    }
}
