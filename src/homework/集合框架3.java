package homework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class 集合框架3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("4");
        list.add("4");
        list.add("2");
        list.add("5");
        list.add("4");
        list.add("7");

        for(int i =0;i<list.size();i++){
            if(list.get(i)=="4"||list.get(i)=="2"){
              list.remove(i);
            }
            if(list.get(i)=="5"){
                list.set(i,"9");
            }

        }

        for(String s:list){
            System.out.println(s);
        }

    }

}
