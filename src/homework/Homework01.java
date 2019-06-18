package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework01 {
    public static void main(String args[]) {
        //创建目录
        String path = "d:"+File.separator+"homework";
        File f = new File(path);
        f.mkdir();
        //在目录中创建文件
        File f1 = new File(f.getAbsoluteFile()+File.separator+"nico.txt");
        try {
            f1.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }

        //向文件中写入内容（字节流）
        try {
            int i=0;
            String nico="niconiconi妮可妮可妮lovelive小岛秀夫Nintendo";
            List<String> result = new ArrayList<String>();
            while(i<nico.length()){
                String str= nico.substring(0,i);
                if(str.getBytes().length>10){
                    str= nico.substring(0,i-1);
//                  System.out.println(str);
                    result.add(str);
                    i=0;
                    nico = nico.replace(str,"");
                }
                i++;
            }
            result.add(nico);

            //System.out.println(result);
            
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f1,true);//true 追加写入
            // 把数据写入到输出流
            for(int ii = 0 ; ii < result.size() ; ii++) {
                System.out.println(result.get(ii));
                fos.write(result.get(ii).getBytes());
                fos.write("\r\n".getBytes());
            }

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
