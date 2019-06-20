package day0620;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.sql.SQLOutput;

class m implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "运行" + i);
        }
    }

}
    public class Test21 {
        public static void main(String[] args) {

            m mm = new m();
            Thread t = new Thread(mm, "线程m");
            t.start();

            for (int i = 0; i < 50; i++) {
                if (i > 10) {
                    try {
                        t.join();
                    } catch (Exception e) {
                    }
                }
                System.out.println("main 线程运行 --> " + i);
            }

        }

    }


