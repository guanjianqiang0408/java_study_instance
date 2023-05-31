package javaInstance.fileOperateInstance;

import java.io.File;

public class SetFileOnlyRead {
    // 设置文件只读
    public static void main(String[] args) {
        File f = new File("filenames");
        if(f.setReadOnly()){
            System.out.println("设置文件只读成功");
        }else{
            System.out.println("设置文件只读失败");
        }
    }
}
