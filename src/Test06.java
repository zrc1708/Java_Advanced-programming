import java.util.*;

class Person implements Comparable<Person> {
    private int age;
    private String name;
    private  String adder;

    public Person(int age,String name,String adder){
        this.age = age;
        this.name = name;
        this.adder = adder;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name=name;
        return name;
    }
    public String getAdder(){
        return adder;
    }
    public String setAdder(String adder){
        this.adder=adder;
        return adder;
    }

//    @Override
//    public int compare(Person o1, Person o2) {
//        if(o1.getAge()>o2.getAge()){
//            return -1;
//        }else if(o1.getAge()<o2.getAge()){
//            return 1;
//        }else{
//            return 0;
//        }
//    }
    public int compareTo(Person o) {
        if(this.age>o.getAge()){
            return -1;
        }else if(this.age<o.getAge()){
            return 1;
        }else{
            return this.name.compareTo(o.getName())*-1;
        }
    }

    public String toString() {
        return "[age:"+this.age+"  name:"+this.name+"  adder:"+this.adder+"]";
    }
    public int hashCode(){
        return this.age*this.name.hashCode()*this.adder.hashCode();
    }
    public boolean equals(Object obj){
        Person p = (Person) obj;
        if(p.getAge()==this.getAge()&&p.getName()==this.getName()&&p.getAdder()==this.getAdder()){
            return true;
        }else{
            return false;
        }
    }

}

public class Test06 {
    public static void main(String args[]){
        TreeSet<Person> set = new TreeSet<Person>();
        Person p1 = new Person(30,"小龙女","古墓");
        Person p2 = new Person(21,"杨过","古墓");
        Person p3 = new Person(25,"李莫愁","古墓");
        Person p4 = new Person(21,"秋天吃","绝情谷");
        Person p5 = new Person(21,"秋天吃","绝情谷");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);


        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println(p5.hashCode());

        System.out.println(p5.toString());
        System.out.println(p4.equals(p5));

        System.out.println(set);

        Iterator it =set.iterator();
//        while(it.hasNext()){
//            System.out.println(set);
//        }
    }
}
