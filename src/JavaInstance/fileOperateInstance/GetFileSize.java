package JavaInstance.fileOperateInstance;

import java.io.File;

public class GetFileSize {
    // 获取文件大小
    public static void main(String[] args) {
        File f = new File("javaFile.txt");
        if((!f.exists())||(!f.isFile())){
            System.out.println("文件不存在");
        }
        // 读取文件大小
        System.out.println(f.length());
    }
}
