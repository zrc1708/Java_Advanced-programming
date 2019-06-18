import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
//键不能重复
//
public class Test07 {
    public static void main(String args[]) {
        Map<String,String>hashmap = new HashMap<String,String>();
        hashmap.put("1","aa");
        hashmap.put("2","bb");
        hashmap.put("3","cc");
        hashmap.put("4","dd");
        hashmap.put("3","cc");
        hashmap.put(null,"jj");
        //打印大小
        System.out.println("打印大小");
        System.out.println(hashmap.size());
        //打印所有的键
        System.out.println("打印所有的键");
        Set set = hashmap.keySet();
        System.out.println(set);
        //打印所有的值
        System.out.println("打印所有的值");
        System.out.println(hashmap.values());
        //打印所有的键值对
        System.out.println("打印所有的键值对");
        Set<Map.Entry<String,String>> set1=hashmap.entrySet();
        for(Map.Entry<String,String> obj:set1) {
            System.out.println(obj);
        }
        //根据键打印值
        System.out.println("根据键打印值");
        System.out.println(hashmap.get("3"));


    }

}
