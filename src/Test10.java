import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test10 {
    public static void main(String args[]) {
        Properties pro = new Properties();

        pro.setProperty("nj","南京");
        pro.setProperty("bj","北京");
        pro.setProperty("sh","上海");

        System.out.println(pro.get("bj"));
        File f = new File("message.properties");

        try {
            pro.store(new FileOutputStream(f),"ff");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        

    }
}
