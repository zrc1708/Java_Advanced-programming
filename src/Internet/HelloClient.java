package Internet;

import java.net.*;
import java.io.*;

public class HelloClient {
    public static void main(String[] args) {
        try {
            Socket client = null;               // 声明Socket对象
            client = new Socket("localhost", 8888); // 指定连接的主机和端口
            BufferedReader buf = null;      // 声明BufferedReader对象，接收信息
            buf = new BufferedReader(
                    new InputStreamReader(
                            client.getInputStream()));// 取得客户端的输入流
            String str = buf.readLine();        // 读取信息
            System.out.println("服务器端输出内容：" + str);
            client.close();     // 关闭Socket
            buf.close();        // 关闭输入流
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
