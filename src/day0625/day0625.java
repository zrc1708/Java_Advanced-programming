package day0625;


class x{

}

public class day0625 {
    public static void main(String[] args) {
        x obj = new x() ;
        System.out.println(obj.getClass().getName());
        //实例化class类的三种方式
        Class<?> x1 = null;
        Class<?> x2 = null;
        Class<?> x3 = null;
        try {
            x1 = Class.forName("day0625.x");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
