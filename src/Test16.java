import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test16 {
    public static void main(String[] args)throws Exception {
        //将system.in转换成字符流
        InputStreamReader in = new InputStreamReader(System.in);
        //用缓冲流来包装字符流
        BufferedReader bf = new BufferedReader(in);
        System.out.println("输入用户名");
        String str = bf.readLine();
        System.out.println(str);

    }
}
