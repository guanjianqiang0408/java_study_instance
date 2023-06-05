package JavaInstance.forlderOperateInstance;

import java.io.File;

public class FindFileInForlder {
    // 目录中查找文件
    public static void main(String[] args) {
        File dir = new File("test");
        String [] chirld = dir.list();
        if(chirld == null){
            System.out.println("Dir not exists");
        }else{
            for(int index=0; index<chirld.length; index++){
                String filename = chirld[index];
                System.out.println(filename);
            }
        }
    }
}
