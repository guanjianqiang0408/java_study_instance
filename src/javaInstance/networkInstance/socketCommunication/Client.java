package javaInstance.networkInstance.socketCommunication;

import java.io.*;
import java.net.Socket;

public class Client {
    // 客户端
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1", 8888);
            // 构建IO
            InputStream io = socket.getInputStream();
            OutputStream oo = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(oo));
            // 向服务端发送消息
            bw.write("测试客户端和服务器通信，服务器接收到消息返回到客户端\\n");
            bw.flush();

            // 读取服务端返回的消息
            BufferedReader bf = new BufferedReader(new InputStreamReader(io));
            String message = bf.readLine();
            System.out.println("服务端: " + message);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
