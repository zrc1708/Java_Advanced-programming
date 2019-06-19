import java.io.*;


public class 复制照片 {
    public static void main(String[] args) {
               String path = "d:"+File.separator+"1.jpg";
               String path1 = "e:"+File.separator+"ss.jpg";
               File f = new File(path);
               try {
                   byte b1[] = rd(path);
                   wr(path1,b1);
               }catch (Exception e){
                   e.printStackTrace();
               }


    }

    //1读取d盘中的照片到内存中
    public  static  byte[] rd(String f) throws Exception{
        InputStream in= new FileInputStream(f);
        byte b[]= new byte[in.available()];
        in.read(b);
        return b;

    }


    //把内存中的照片再写入c盘
    public static void wr(String f,byte b[])throws Exception {
        OutputStream out = new FileOutputStream(f);
        out.write(b);
        out.close();
    }
}
