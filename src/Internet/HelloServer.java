package Internet;

import java.net.*;
import java.io.*;

public class HelloServer {
    public static void main(String args[]) throws Exception {// 所有异常抛出
        ServerSocket server = null;
        Socket client = null;
        PrintStream out = null;
        server = new ServerSocket(8888);  // 此时服务器在8888端口上等待客户端的访问
        System.out.println("服务器运行，等待客户端连接");
        client = server.accept();
        String str = "hello world!!!";
        out = new PrintStream(client.getOutputStream()); // 实例化打印流对象，输出
        out.println(str);
        out.close();
        client.close();
        server.close();
    }
}