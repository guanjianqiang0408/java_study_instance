package javaInstance.forlderOperateInstance;

import java.io.File;

public class GetFileUpForlder {
    // 获取文件上级目录
    public static void main(String[] args) {
        File file = new File("filenames");
        String upForlder = file.getParent();
        System.out.println(upForlder);
    }
}
