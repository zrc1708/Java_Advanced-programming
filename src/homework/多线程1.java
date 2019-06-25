package homework;



class MyThread1 implements Runnable{
    int name;
    int number=100;

    public MyThread1(int name) {
        this.name = name;
    }

    public void run() {
        while (true) {
            if(name<=2){
            this.jia();
            }else{
                this.jian();
            }
        }
    }
    public void jia(){
        try {
            Thread.sleep(300);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(name+"  "+number++);
    }
    public void jian(){
        try {
            Thread.sleep(300);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(name+"  "+number--);
    }
}


public class 多线程1 {
    public static void main(String[] args) {
        MyThread1 a = new MyThread1(1);
        MyThread1 b = new MyThread1(2);
        MyThread1 c = new MyThread1(3);
        MyThread1 d = new MyThread1(4);

        new Thread(a).start();
        new Thread(b).start();
        new Thread(c).start();
        new Thread(d).start();

    }

}
