package JavaInstance.fileOperateInstance;

import java.io.File;
import java.util.Date;

public class ModifiedFileLastTime {
    // 修改文件的最后修改日期
    public static void main(String[] args) throws Exception{
        File f = new File("javaFile.txt");
        // 创建文件
        f.createNewFile();
        // 获取文件最后修改时间
        Date fileDate = new Date(f.lastModified());
        System.out.println(fileDate.toString());
        // 更新文件最后修改时间
        System.out.println(f.setLastModified(System.currentTimeMillis()));
        fileDate = new Date(f.lastModified());
        System.out.println(fileDate.toString());
    }
}
