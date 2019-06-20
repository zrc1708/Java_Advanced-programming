package day0620;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyThread extends Thread{

    private String name;

    public void run(){
        for (int i=0;i<5;i++){
//            System.out.println(name+"  正在运行  "+i);
            System.out.println(Thread.currentThread().getName()+"  正在运行  "+i);
        }
    }
}

class Test_test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");

        //启动线程
        t1.start();
        t2.start();
        t3.start();


    }

}



