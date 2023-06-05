package JavaInstance.fileOperateInstance;

import java.io.*;

public class FileInfoCopyOperate {
    // 复制文件内容
    public static void main(String[] args) throws IOException {
        // 创建文件并写入内容
        BufferedWriter bf = new BufferedWriter(new FileWriter("srcfile"));
        bf.write("String to be copied");
        bf.close();
        // 读取文件内容后写入到另外一个文件
        InputStream io = new FileInputStream(new File("srcfile"));
        OutputStream oo = new FileOutputStream(new File("tarfile"));
        byte [] buff = new byte[1024];
        int len;
        while((len = io.read(buff)) > 0){
            oo.write(buff, 0, len);
        }
        io.close();
        oo.close();
        // 读取另外一个文件内容并输出
        BufferedReader br = new BufferedReader(new FileReader("tarfile"));
        String str;
        while((str = br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
    }
}
