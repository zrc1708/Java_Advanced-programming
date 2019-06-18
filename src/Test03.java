

import java.awt.List;
import java.util.ArrayList;

public class Test03 {

    public static void main(String[] args) {
        ArrayList  <Object>nico	 = new ArrayList();
        nico.add(0,"aa");
        nico.add(1,"bb");
        nico.add(2,"cc");
        nico.add(3,"dd");

        System.out.println(nico);

        System.out.println("位置1的元素为："+nico.get(1));//返回指定位置的元素
        System.out.println("查找bb的位置："+nico.indexOf("bb"));//查找指定元素的位置
        System.out.println("从后向前查找bb的位置："+nico.lastIndexOf("bb"));//从后向前查找指定元素的位置

        nico.remove(2);//按指定位置删除元素
        System.out.println("删除位置2的元素后："+nico);
        nico.set(2, "我被替换了");//替换指定位置的元素
        System.out.println("替换位置2的元素后："+nico);

        ArrayList<Object> ni = new ArrayList<>();
        ni.add(0,"n");
        ni.add(1,"i");

        nico.addAll(ni);//指定位置添加一组元素
        System.out.println("添加一组元素后："+nico);
        System.out.println("位置1-3："+nico.subList(1, 3));//取出集合中的子集合




    }

}
