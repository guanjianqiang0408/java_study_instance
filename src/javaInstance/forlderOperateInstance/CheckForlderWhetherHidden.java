package javaInstance.forlderOperateInstance;

import java.io.File;

public class CheckForlderWhetherHidden {
    // 判断文件是否隐藏
    public static void main(String[] args) {
        File file = new File("filenames");
        if(file.isHidden()){
            System.out.println("File is hidden");
        }else{
            System.out.println("File isn't hidden");
        }
    }
}
