package day0625;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Intel {
    public static void main(String[] args) {
        InetAddress add1 =null;
        InetAddress  remv = null;
        try {
            InetAddress host = InetAddress.getLocalHost();
            String ip =host.getHostAddress();
            System.out.println("本机ip地址：" + ip);
        }catch (UnknownHostException e){
            e.printStackTrace();
        }




    }
}
