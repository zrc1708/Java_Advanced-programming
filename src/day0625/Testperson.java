package day0625;


class person{
    private String  name;
    private  int age;

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
}
public class Testperson {
    public static void main(String[] args) {
        Class<?> c =null;
        try {
            c=Class.forName("day0625.person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        person p =null;
        try {
            p =(person)c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        p.setName("张三");
        p.setAge(15);
        System.out.println(p.getName()+p.getAge());

    }
}
