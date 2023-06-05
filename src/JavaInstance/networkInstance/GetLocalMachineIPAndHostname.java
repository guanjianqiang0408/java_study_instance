package JavaInstance.networkInstance;

import java.net.InetAddress;

public class GetLocalMachineIPAndHostname {
    // 获取本机ip地址及主机名
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        String hostname = addr.getHostName();
        System.out.println("ip地址:" + addr.getHostAddress() + " 主机名: " + hostname);
    }
}
