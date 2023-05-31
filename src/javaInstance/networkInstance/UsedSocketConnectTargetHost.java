package javaInstance.networkInstance;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class UsedSocketConnectTargetHost {
    //使用 Socket 连接到指定主机
    public static void main(String[] args) {
        try{
            InetAddress addr;
            Socket socket = new Socket("www.runoob.com", 80);
            addr = socket.getInetAddress();
            System.out.println("连接到" + addr);
            socket.close();
        }catch (IOException e){
            System.out.println("无法连接" + args[0]);
        }
    }
}
