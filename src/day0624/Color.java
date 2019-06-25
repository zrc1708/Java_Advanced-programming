package day0624;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public enum  Color {
    RED(),GREEN(),BLUE();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class getcolor{
    public static void main(String[] args) {
//        Color c  = Color.BLUE;
//        System.out.println(c);
//
//
//        for (Color cc :Color.values()){
//            System.out.println(cc .ordinal()+"----->"+cc.name());
//        }
//
//        Color ccc = Enum.valueOf(Color.class,"BLUE");
//        ccc.setName("蓝色");
//        System.out.println(ccc.getName());
        Set<Color>t = new TreeSet<Color>();
        t.add(Color.BLUE);
        t.add(Color.GREEN);
        t.add(Color.RED);
        Iterator it = t.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+"  ");
        }
    }
}