import java.util.*;

public class Test09 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("ff");
        list.add("dd");
        list.add("aa");
        list.add("ss");

        //排序
        Collections.sort(list);
        System.out.println(list);


        int s = Collections.binarySearch(list,"ff");
        System.out.println(s);

        List<String> list2 = new ArrayList<String>();
        Collections.addAll(list2,  new  String[list.size()]);
        Collections.copy(list2, list);
        System.out.println(list2);

        List list3=Collections.emptyList();
        System.out.println(list3);

        System.out.println(Collections.max(list));

        List nico = Arrays.asList("aa","bb");
        System.out.println(nico);
    }
}
