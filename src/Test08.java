import com.sun.jmx.remote.internal.ClientListenerInfo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
//hashMap效率高 线程异步  键可以为空
//hashtable 键不可以为空
public class Test08 {
    public static void main(String args[]) {
        Map<student,String> map = new HashMap<student, String>();

        student s1 = new student(1,"张三");
        student s2 = new student(2,"李四");
        student s3 = new student(3,"王五");
        student s4 = new student(3,"王五");

        map.put(s1,"aa");
        map.put(s2,"bb");
        map.put(s3,"cc");
        map.put(s4,"dd");

        System.out.println(map.size());


    }
}
class student{
    private int age;
    private String name;

    public student(int age,String name) {
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}