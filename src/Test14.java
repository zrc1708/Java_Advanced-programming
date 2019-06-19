
import java.io.*;

public class Test14 {
    public static void main(String[] args) {

        File f=new File("d:"+ File.separator+"text.txt");
        Writer out;
        try {
            out=new FileWriter(f);
            String str="hello world";
            out.write(str);
            out.flush();
//            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        Reader rd=null;
        try {
            rd=new FileReader(f);
            char c[]=new char[100];
            int len=rd.read(c);
            System.out.println(new String(c,0,len));
        }catch(Exception e){
            e.printStackTrace();
        }




    }

}
