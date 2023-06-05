package JavaInstance.fileOperateInstance;

import java.io.File;

public class CheckFileExists {
    // 校验文件是否存在
    public static void main(String[] args) {
        File f = new File("filenames");
        if(f.exists()){
            System.out.println("文件存在");
        }else{
            System.out.println("文件不存在");
        }
    }
}
