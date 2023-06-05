package JavaInstance.networkInstance;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class CheckPortWhetherUsed {
    // 查看端口是否被占用
    public static void main(String[] args) {
        Socket skt;
        String host = "localhost";
        for(int port=0; port<1024; port++){
            try{
                System.out.println("查看" + port);
                // 创建socket不成功则表示端口被占用
                skt = new Socket(host, port);
                System.out.println("端口" + port + "被占用");
            }catch (UnknownHostException e ){
                break;
            }catch (IOException e){

            }
        }
    }
}
