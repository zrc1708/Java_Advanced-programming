package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 集合框架9 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>() ;
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        map.put("5","f");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            if(Integer.parseInt(entry.getKey())%2 == 0)
                it.remove();//使用迭代器的remove()方法删除元素
        }
        System.out.println(map);

    }
}
