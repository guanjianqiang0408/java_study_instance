package javaInstance.fileOperateInstance;

import java.io.File;

public class FilePathCompare {
    // 文件路径比较
    public static void main(String[] args) {
        File f1 = new File("filenames");
        File f2 = new File("temporary01.txt");
        if(f1.compareTo(f2) == 0){
            System.out.println("文件路径相同");
        }else{
            System.out.println("文件路径不同");
        }
    }
}
