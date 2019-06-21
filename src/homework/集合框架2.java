package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class 集合框架2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("输入点东西，end为终止");
        Scanner sc = new Scanner(System.in);
        String str ;
        do {
            str =  sc.nextLine();
            list.add(str);
        }while (str.equals("end")!=true);
        System.out.println("添加完毕");
        list.remove(list.size()-1);
        for(String  s : list){
            System.out.print(s+"  ");
        }
        int ok=0;
        for(int i =0;i<list.size();i++){
            int flag=0;
            for(int ii =0;ii<list.size();ii++){
                if(list.get(i).equals(list.get(ii))){
                        flag++;
                }
            }
            if(flag>=2){
                ok=2;
                break;
            }else{
                ok=1;
            }
        }
        if(ok==1){
            System.out.println("没有重复");
        }else{
            System.out.println("有重复的");
        }

    }
}
