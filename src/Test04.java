import java.util.LinkedList;

public class Test04 {
    public static void main(String[] args) {
        LinkedList<Object> nico = new LinkedList<>();
        nico.add("one");
        nico.add("two");
        nico.add("three");
        nico.add("four");
        System.out.println(nico);
        nico.addFirst("first");
        nico.addLast("last");
        System.out.println(nico);
        System.out.println(nico.element());
        System.out.println(nico.peek());
        System.out.println(nico.poll());
    }
}
