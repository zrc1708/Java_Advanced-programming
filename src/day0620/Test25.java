/**
 * 线程的同步(同步代码块)
 */

package day0620;

class MyThread6 implements Runnable{
    private  int ticket = 5;
    public  void run(){
        for(int i = 0;i<10;i++){
            synchronized (this){
                   if(ticket>0){
                        try{
                            Thread.sleep(300);

                        }catch (Exception e){
                            e.printStackTrace();
                        }
                       System.out.println("卖票：ticket = "+ticket--);
                   }

            }
        }
    }

}


public class Test25 {
    public static void main(String[] args) {
        MyThread6 mt = new MyThread6();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
    }


}
