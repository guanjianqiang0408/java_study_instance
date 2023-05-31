package javaInstance.fileOperateInstance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadOperate {
    // 读取文件内容
    public static void main(String[] args) {
        try{
            // 文件读取流
            BufferedReader br = new BufferedReader(new FileReader("runoob.txt"));
            String str;
            // 读取文件中所有内容
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
