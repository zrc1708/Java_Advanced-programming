package Finaltest;

import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private ArrayList<String> score ;
    @Override
       public String toString() {
        return "姓名："+name+"  学号："+id+"  语文："+score.get(0)+"  数学："+score.get(1)+"  英语："+score.get(2);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getScore() {
        return score;
    }

    public void setScore(ArrayList<String> score) {
        this.score = score;
    }
}

public class Run{
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();
        for (int i = 0; i < 5; i++) {
            Student stu = new Student();
            Scanner sc = new Scanner(System.in);
            System.out.println("输入第" + (i + 1) + "名学生的ID");
            String id = sc.nextLine();
            stu.setId(id);
            System.out.println("输入第" + (i + 1) + "名学生姓名");
            String name = sc.nextLine();
            stu.setName(name);
            System.out.println("输入第" + (i + 1) + "名学生的三门成绩，逗号分隔");
            String score = sc.nextLine();
            String[] array = score.split(",");
            ArrayList<String> arr = new ArrayList<String>();
            arr.add(array[0]);
            arr.add(array[1]);
            arr.add(array[2]);
            stu.setScore(arr);
            student.add(stu);
        }

        File f  = new File("d:"+File.separator+"stud.txt");

        for(Student obj:student){
            Writer out;
            try {
                out=new FileWriter(f,true);
                out.write(obj.toString());
                out.write("\n");
                out.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
