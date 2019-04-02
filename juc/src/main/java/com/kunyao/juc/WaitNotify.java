package com.kunyao.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class WaitNotify {

    static Object lock = new Object();

    public static void main(String[] args){
        Object lock1 = new Object();
        Object lock2 = new Object();
        Object lock3 = new Object();
        AtomicInteger flag = new AtomicInteger(1);
        Thread t1 = new Thread(()->{

            try {
                for (;;){

                    synchronized (lock1){
                        while(flag.get() !=1){
                            lock1.wait();
                        }
                        System.out.print("a");
                        flag.set(2);
                        TimeUnit.SECONDS.sleep(1);
                    }

                    synchronized (lock2){
                        lock2.notify();
                    }

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread t2 = new Thread(()->{

            try {
                for (;;){

                    synchronized (lock2){
                        while(flag.get() !=2){
                            lock2.wait();
                        }
                        System.out.print("b");
                        flag.set(3);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    synchronized (lock3){
                        lock3.notify();
                    }

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread t3 = new Thread(()->{

            try {
                for (;;){

                    synchronized (lock3){
                        while(flag.get() !=3){
                            lock3.wait();
                        }
                        System.out.print("c");
                        flag.set(1);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    synchronized (lock1){
                        lock1.notify();
                    }

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        t2.start();
        t1.start();
        t3.start();
    }
}
