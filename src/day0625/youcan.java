package day0625;

import java.lang.reflect.Constructor;

class person2{
    private String  name;
    private  int age;

    public person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class youcan {
    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("day0625.person2");
    }   catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
        person2 per = null;
        Constructor<?> cons[] = null;
        cons = c.getConstructors();
        try {
            // 向构造方法中传递参数，此方法使用可变参数接收，并实例化对象
            per = (person2) cons[0].newInstance("李兴华", 30);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(per.toString());
        }
    }
