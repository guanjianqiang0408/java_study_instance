package JavaInstance.forlderOperateInstance;

import java.io.File;

public class CheckForlderWhetherNull {
    // 判断目录是否为空
    public static void main(String[] args) {
        File f = new File("testdir");
        if(f.isDirectory()){
            if(f.list().length > 0){
                System.out.println("Forlder isn't null");
            }else{
                System.out.println("Forlder is null");
            }
        }else{
            System.out.println("This not is forlder");
        }
    }
}
