package JavaInstance.fileOperateInstance;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    // 创建文件
    public static void main(String[] args) {
        try {
            File file = new File("temporary01.txt");
            if(file.createNewFile()){
                System.out.println("创建文件成功");
            }else{
                System.out.println("创建文件失败");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
