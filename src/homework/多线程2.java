package homework;
/**
 *
 */

import java.util.logging.Handler;

class Computer{
    private  int id ;//电脑的初始值
    //为true表示存在一台电脑
    boolean flag = false;//false 表示没有电脑 需要生产
    private int cut  = 1;

    //定义生产的方法
    public void  in() {
        synchronized (this) {
            while (flag) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            id = cut++;
            System.out.println(Thread.currentThread().getName()+"生产一台电脑：" + id);
            flag = true;
            this.notifyAll();
        }

    }

    //代表消费
    public void out(){
        synchronized (this){
            while (!flag){
                try {
                    this.wait();         //消费者2
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName()+"搬运一台电脑"+id);
            flag = false;
            this.notifyAll();          //消费者1
        }
    }
}
//生产者
class Cooker extends Thread{
    private  Computer hamberg;
    public Cooker(Computer hamberg){
        this.hamberg= hamberg;
    }
    public void run(){
        while (true){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            hamberg.in();
        }
    }
}
//消费者
class  Customer extends Thread{
    private  Computer hamberg;
    public Customer(Computer hamberg){
        this.hamberg= hamberg;
    }
    public void run(){
        while (true){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            hamberg.out();
        }
    }

}

public class 多线程2 {
    public static void main(String[] args) {
        Computer h = new Computer();

        Cooker cooker = new Cooker(h);
        cooker.start();
        Customer customer = new Customer(h);
        customer.start();

        Cooker cooker2 = new Cooker(h);
        cooker2.start();
        Customer customer2 = new Customer(h);
        customer2.start();



    }
}

