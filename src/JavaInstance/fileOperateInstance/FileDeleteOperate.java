package JavaInstance.fileOperateInstance;

import java.io.File;

public class FileDeleteOperate {
    // 删除文件
    public static void main(String[] args) {
        try{
            // 创建文件
            File file = new File("C:\\Users\\YY\\Desktop\\java_study_instance\\runoob.txt");
            if(file.delete()){
                System.out.println(file.getName() + "文件已被删除");
            }else{
                System.out.println("文件删除失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
