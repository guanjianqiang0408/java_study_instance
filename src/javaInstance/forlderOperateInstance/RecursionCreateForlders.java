package javaInstance.forlderOperateInstance;

import java.io.File;

public class RecursionCreateForlders {
    // 递归删除目录
    public static void main(String[] args) {
        File f = new File("a/b/c/d");
        if(f.mkdirs()){
            System.out.println("Create Success");
        }else{
            System.out.println("Create failed");
        }
    }
}
