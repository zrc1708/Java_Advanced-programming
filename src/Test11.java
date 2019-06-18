//file文件流  字节流  字符流  字节和字符流的互相转化  打印流  缓冲流

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Test11 {
    public static void main(String args[]) {
        //创建目录
        String str = "d:"+File.separator+"aaa";
        File f = new File(str);
        f.mkdir();
        //在目录中创建文件
        File f1 = new File(f.getAbsoluteFile()+File.separator+"ss.txt");
        try {
            f1.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }

        //向文件中写入内容（字节流）
        try {
            String nico="\r\nniconiconi";
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f1,true);//true 追加写入
            // 把数据写入到输出流
            fos.write(nico.getBytes());
            // 关闭输出流
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        //读取文件内容
        try {
            //创建基于文件的输入流
            FileInputStream fis =new FileInputStream(f1);
            //创建字节数组，其长度就是文件的长度
            byte[] all =new byte[fis.available()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
//            for (byte b : all) {
//                System.out.println(b);
//            }
            System.out.println(new String(all));
            //每次使用完流，都应该进行关闭
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
