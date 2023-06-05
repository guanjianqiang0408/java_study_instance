package JavaInstance.fileOperateInstance;

import java.io.File;

public class CreateOnTargeForlder {
    // 指定目录中创建文件
    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File("C:/");
        file = File.createTempFile
                ("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}
