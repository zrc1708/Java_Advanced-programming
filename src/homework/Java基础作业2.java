package homework;


import java.util.ArrayList;
import java.util.Scanner;

public class Java基础作业2 {

    public  static String in(){
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        if(str.indexOf("end")!=-1){
            return "false";
        }else {
            return str;
        }
    }

    public static Object add(String str){
        String[] array = str.split(",");

        int number = Integer.parseInt(array[0]);
        String name = array[1];
        double money = Double.valueOf(array[2].toString());
        char sex = array[3].charAt(0);

        try {
            Account nico = new Account(money, "12345", number, name, sex);
            return nico;
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static void main(String[] args) {

        ArrayList  <Object> objects	 = new ArrayList();
        System.out.println("请输入账号，姓名，金额，性别，以逗号隔开");

        while (true){
            String str = in();
            if(str.equals("false")) {
                System.out.println("结束");
                break;
            }else{
//                System.out.println(add(str));
                if(add(str).toString().length()>=10){
                    objects.add(add(str));
                    System.out.println("添加完成");
                }else {
                    System.out.println("添加失败");
                }

            }
        }
        for (Object obj : objects) {//foreach
            System.out.println(obj);
        }


    }
}
