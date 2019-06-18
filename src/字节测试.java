import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

public class 字节测试 {
    public static void main(String[] args) {
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

        System.out.println(result);
    }
}
