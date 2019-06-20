package day0620;
class MyThread3 extends Thread{
    private int ticket = 5;


    public void run(){
        for (int i =0;i<10;i++){
            if(ticket>0){
                System.out.println("黄牛卖票： tickect" +ticket--);
            }
        }
    }
}

class maigepiao implements Runnable{
    private int ticket = 5;


    public void run(){
        for (int i =0;i<10;i++){
            if(ticket>0){
                System.out.println("卖票： tickect" +ticket--);
            }
        }
    }
}

public class Test20 {
    public static void main(String[] args) {
        MyThread3 m1 = new MyThread3();
        MyThread3 m2 = new MyThread3();
        MyThread3 m3 = new MyThread3();

        m1.start();
        m2.start();
        m3.start();


        maigepiao m = new maigepiao();
        new Thread(m).start();
        new Thread(m).start();
        new Thread(m).start();

    }
}
