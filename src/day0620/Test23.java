package day0620;

class MyThread4 implements Runnable{
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

public class Test23 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread4(),"线程1");
        Thread t2 = new Thread(new MyThread4(),"线程2");
        Thread t3 = new Thread(new MyThread4(),"线程3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t2.start();
        t3.start();



    }
}
