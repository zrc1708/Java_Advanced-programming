package homework;

import java.util.ArrayList;


public class 集合框架6 {
    public static void main(String[] args) {
        ArrayList  <Account> objects	 = new ArrayList();
        System.out.println("请输入账号，姓名，金额，性别，以逗号隔开");
        Addmenber ad = new Addmenber();
        boolean flag = true;
        while (true){
            String str = ad.in();
            if(str.equals("false")) {      //检查输入是否是end
                System.out.println("结束");
                break;
            }else{
                if(ad.add(str).getName()!=null) {        //输入合法，对象创建成功
                    if (flag) {                          //第一条对象,无须查重
                        objects.add(ad.add(str));
                        System.out.println("添加完成");
                        flag = !flag;
                    } else {                             //之后的对象，需要查重
                        boolean flag2 = true;
                        for (int i = 0; i < objects.size(); i++) {         //遍历list检查是否重复
                            if (objects.get(i).getNumber() == ad.add(str).getNumber()) {
//                            objects.add(ad.add("封号吧"));
                                flag2=!flag2;
                                break;
                            }
                        }
                        if(flag2){                      //无重复则将对象写入list
                            objects.add(ad.add(str));
                            System.out.println("添加完成");
                        }else{                          //有重复则不写入
                            System.out.println("封号");
                        }
                    }
                }else{                                  //输入非法，直接提示失败
                    System.out.println("添加失败");
                }
            }
        }
        for (Account obj : objects) {//foreach
            System.out.println(obj);
        }

    }
}
