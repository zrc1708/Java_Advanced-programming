package day0624;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Color,String> desc = null;
        desc  = new EnumMap<Color, String>(Color.class) ;
        desc.put(Color.RED, "红色");
        desc.put(Color.GREEN, "绿色");
        desc.put(Color.BLUE, "蓝色") ;
        System.out.println("===== 输出全部的内容    =====");
        for(Color c:Color.values()){
            System.out.println(c.name() + " --> " + desc.get(c));
        }
        System.out.println("===== 输出全部的键值    =====");
        for(Color c:desc.keySet()){
            System.out.print(c.name() + "、");
        }
        System.out.println() ;
        System.out.println("===== 输出全部的内容    =====");
        for(String s:desc.values()){
            System.out.print(s + "、");

        }
    }

}
