package JavaInstance.fileOperateInstance;

import java.io.File;
import java.util.Date;

public class GetFileModifiedDate {
    // 获取文件修改时间
    public static void main(String[] args) {
        File f = new File("filenames");
        Date date = new Date(f.lastModified());
        System.out.println(date);
    }
}
