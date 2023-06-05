package JavaInstance.fileOperateInstance;

import java.io.File;

public class RenameFilename {
    // 重命名文件名
    public static void main(String[] args) {
        File of = new File("filename");
        File nf = new File("filenames");
        if(nf.exists()){
            System.out.println(nf.getName() + "文件名已存在");
        }
        if(of.renameTo(nf)){
            System.out.println("文件名更新成功");
        }else{
            System.out.println("文件名更新失败");
        }
    }
}
