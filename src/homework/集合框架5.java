package homework;

import java.util.ArrayList;

public class 集合框架5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("4");
        list.add("62");
        list.add("2");
        list.add("35");
        list.add("4");
        list.add("7");

        for(int i =0;i<list.size();i++){
            for(int ii = 0;ii<list.size()-1-i;ii++){
                if(Integer.parseInt(list.get(ii))>Integer.parseInt(list.get(ii+1))){
                    String str = list.get(ii);
                    list.set(ii,list.get(ii+1));
                    list.set(ii+1,str);
                }
            }
        }
        for (String s:list){
            System.out.println(s);
        }
    }
}
