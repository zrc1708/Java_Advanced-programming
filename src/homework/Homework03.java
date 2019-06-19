package homework;

import java.io.File;
import java.util.Scanner;

public class Homework03 {
    public static void traverseFolder(String path,String name) {

        File file = new File(path);
        //文件是否存在
        if (file.exists()) {
            // 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
            File[] fs = file.listFiles();

            if (null == fs) {
//                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : fs) {    //遍历File[]数组
                    //是否是文件夹
                    if (file2.isDirectory()) {
//                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolder(file2.getAbsolutePath(),name);    // getAbsolutePath()返回抽象路径名的绝对路径名字符串
                    } else {
                        if(cut(file2.getAbsolutePath(),name)) {
                            System.out.println(file2.getAbsolutePath());
                        }
                    }
                }
            }
        } else {
            System.out.println("目标路径不存在!");
        }
    }
    public static boolean cut(String str,String name){
        String newstr=str.replace("\\","@");

        String[] array=newstr.split("@");

        if(array[array.length-1].indexOf(name)!=-1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的文件的路径");
        String path = sc.nextLine();
        System.out.println("请输入你要查找的文件的的关键词");
        String name = sc.next();
        traverseFolder(path,name);


    }
}
