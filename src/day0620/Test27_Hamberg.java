/**
 *
 */
package day0620;

import java.util.logging.Handler;

class Hamberg{
    private  int id ;//汉堡的初始值
    //为true表示存在一个汉堡
    boolean flag = false;//false 表示没有汉堡 需要生产
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
            System.out.println(Thread.currentThread().getName()+"生产一个汉堡：" + id);
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

            System.out.println(Thread.currentThread().getName()+"消费一个汉堡"+id);
            flag = false;
            this.notifyAll();          //消费者1
        }
    }
}
//生产者
class Cooker extends Thread{
    private  Hamberg hamberg;
    public Cooker(Hamberg hamberg){
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
    private  Hamberg hamberg;
    public Customer(Hamberg hamberg){
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

public class Test27_Hamberg {
    public static void main(String[] args) {
        Hamberg h = new Hamberg();

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
