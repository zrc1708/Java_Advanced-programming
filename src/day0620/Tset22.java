package day0620;

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            try {
                 Thread.sleep(500);
            }catch (Exception e){}
            System.out.println(Thread.currentThread().getName()+"运行"+i);
        }
    }
}


public class Tset22 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        new Thread(mt,"线程").start();
    }
}
