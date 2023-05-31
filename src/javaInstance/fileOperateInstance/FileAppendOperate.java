package javaInstance.fileOperateInstance;

import java.io.*;

public class FileAppendOperate {
    // 向文件中追加内容
    public static void main(String[] args) throws Exception {
        try{
            BufferedWriter bf = new BufferedWriter(new FileWriter("filename"));
            bf.write("first line");
            bf.close();
            // FileWriter 参数说明， 第一个写入文件名， 第二个是否追加默认False
            bf = new BufferedWriter(new FileWriter("filename", true));
            bf.write("\nsecond line");
            bf.close();
            BufferedReader br = new BufferedReader(new FileReader("filename"));
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
