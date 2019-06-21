package homework;

import java.util.ArrayList;

public class 集合框架7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("42");
        list.add("24");
        list.add("2");
        list.add("5");
        list.add("16");
        list.add("17");

        for(int i =0;i<list.size();i++){
            if(Integer.parseInt(list.get(i))<5){
                list.remove(list.get(i));
            }
        }
        for (String s:list){
            System.out.println(s);
        }
    }
}
