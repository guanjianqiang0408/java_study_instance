package JavaInstance.networkInstance.socketCommunication;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // 服务端
    public static void main(String[] args) {
        try{
            // 创建服务端监听端口
            ServerSocket socket = new ServerSocket(8888);
            System.out.println("启动服务器");
            // 创建socket接收对象
            Socket sc = socket.accept();
            System.out.println("客户端: " + sc.getInetAddress().getLocalHost()+ "已连接");
            // 读取服务端数据流
            BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            String message = br.readLine();
            System.out.println("客户端: " + message);
            // 写入服务端数据流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
            bw.write(message + "\n");
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
