package javaInstance.forlderOperateInstance;

import java.io.File;

public class DeleteForlder {
    // 删除目录
    public static void main(String[] argv) throws Exception {
        // 删除当前目录下的 test 目录
        deleteDir(new File("a"));
    }
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir
                        (new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        if(dir.delete()) {
            System.out.println("目录已被删除！");
            return true;
        } else {
            System.out.println("目录删除失败！");
            return false;
        }
    }
}
