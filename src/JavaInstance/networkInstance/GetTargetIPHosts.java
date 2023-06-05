package JavaInstance.networkInstance;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetTargetIPHosts {
    // 获取指定主机的IP
    public static void main(String[] args) {
        InetAddress address = null;
        try{
            address = InetAddress.getByName("www.runoob.com");
        }catch (UnknownHostException e){
            System.exit(2);
        }
        System.out.println(address.getHostName() + "=" + address.getHostAddress());
        System.exit(0);
    }
}
