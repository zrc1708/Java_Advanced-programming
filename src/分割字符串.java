import java.util.ArrayList;
import java.util.List;
public class 分割字符串 {
    public static void main(String[] args) {
        String s = "138000138001380013800013777777777";
        List<String> result = new ArrayList<String>();
        int iPos = 0;
        int iLen = s.length();
        while(iLen>=10){
            String tmp = s.substring(0, 10);
            result.add(tmp);
            s= s.substring(10);
            iLen = s.length();
        }
        String tmp = s.substring(0, s.length());
        result.add(tmp);

        for(String st:result){
            System.out.println(st);
        }
        System.out.println(result);
    }
}
