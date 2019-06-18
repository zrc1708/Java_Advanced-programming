import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.HashSet;
import java.util.Set;

public class Test05 {
    public static void main(String args[]){
        Set<String> set = new HashSet<String>();
        String s1 = "hellow";
        String s2 = "hellow";

        Integer i1 = 10;
        set.add(s1);
        set.add(s2);

        //快捷键sout
        System.out.println(s1.hashCode());
        System.out.println(i1.hashCode());
        System.out.println(set.size());
    }
}
