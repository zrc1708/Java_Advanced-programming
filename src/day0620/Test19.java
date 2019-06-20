package day0620;

public class Test19 implements  Runnable{

    private String name;

    public Test19(String name){
        super();
        this.name = name;
    }

    @Override
    public void run() {
        for(int i =0;i<5;i++){
            System.out.println(name +"正在运行"+i);
        }
    }
}

class Testthread2{
    public static void main(String[] args) {
        Test19 t1 = new Test19("a");
        Test19 t2 = new Test19("b");

        new Thread(t1).start();
        new Thread(t2).start();
    }
}