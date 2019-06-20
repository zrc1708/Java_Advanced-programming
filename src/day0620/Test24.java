/**
 * 线程的礼让
 */
package day0620;
class MyThread5 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
//            try {
//                Thread.sleep(500);
//            }catch (Exception e){}
            System.out.println(Thread.currentThread().getName()+"运行"+i);
            if(i==3){
                System.out.println("线程的礼让");
                Thread.yield();
            }
        }
    }
}

public class Test24 {
    public static void main(String[] args) {
        MyThread5 m1 = new MyThread5();
        MyThread5 m2 = new MyThread5();
        Thread t1 = new Thread(m1,"A");
        Thread t2 = new Thread(m1,"B");
        t1.start();
        t2.start();
    }

}
