package com.kunyao.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CutdownLunchTest {

    static CountDownLatch cdl = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{

            try {
                cdl.await();
                for (;;){
                    System.out.println("t1线程执行===========");
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Thread t2 = new Thread(()->{

            try {
                cdl.await();
                for (;;){
                    System.out.println("t2线程执行===========");
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Thread t3 = new Thread(()->{

            try {
                cdl.await();
                for (;;){
                    System.out.println("t3线程执行===========");
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Thread t4 = new Thread(()->{

            try {
                cdl.await();
                for (;;){
                    System.out.println("t4线程执行===========");
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        TimeUnit.MILLISECONDS.sleep(5000);
        cdl.countDown();
    }
}
