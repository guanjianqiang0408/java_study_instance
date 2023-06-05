package JavaInstance.networkInstance;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FeatureSocketMutilThreadServierProcess implements Runnable {
    //Socket 实现多线程服务器程序
    Socket csocket;
    FeatureSocketMutilThreadServierProcess(Socket csocket){
        this.csocket = csocket;
    }

    public static void main(String[] args) throws Exception{
        ServerSocket ssock = new ServerSocket(1024);
        System.out.println("Listing");
        while (true){
            Socket sock = ssock.accept();
            System.out.println("Conneted");
            new Thread(new FeatureSocketMutilThreadServierProcess(sock)).start();
        }
    }

    public void run(){
        try{
            PrintStream pstream = new PrintStream(csocket.getOutputStream());
            for(int i=100; i>=0; i--){
                pstream.println(i + "bottles of beer on the wall");
            }
            pstream.close();
            csocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
