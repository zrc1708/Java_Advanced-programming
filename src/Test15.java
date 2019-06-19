import java.io.*;

import static javax.imageio.ImageIO.read;

public class Test15 {
    public static void main(String[] args) {
        File f  = new File("d:"+File.separator+"aa.txt");
        wr(f);

    }

    public static  void wr(File f){
        Writer wr =null;
        //把字节流转化在成字符流
        try {
            wr = new OutputStreamWriter(new FileOutputStream(f));
            wr.write("hello");
            wr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
//        public static  void re(File f){
//
//            // 创建基于文件的Reader
//            try (FileReader fr = new FileReader(f)) {
//                // 创建字符数组，其长度就是文件的长度
//                char[] all = new char[(int) f.length()];
//                // 以字符流的形式读取文件所有内容
//                fr.read(all);
//                for (char b : all) {
//                    // 打印出来是A B
//                    System.out.println(b);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }

    }
}
