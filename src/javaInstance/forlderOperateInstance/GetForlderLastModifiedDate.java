package javaInstance.forlderOperateInstance;

import java.io.File;

public class GetForlderLastModifiedDate {
    // 获取目录最后修改时间
    public static void main(String[] args) {
        File file = new File("test");
        System.out.println(file.lastModified());
    }
}
