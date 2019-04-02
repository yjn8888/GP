package com.kunyao.juc;

public class DeadLock {

    final static Object lock1 = new Object();
    final static Object lock2 = new Object();

    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            for(;;){
                synchronized (lock1){
                    System.out.println("获得lock1");
                    synchronized (lock2){
                        System.out.println("获得lock2");
                    }
                }
            }

        });

        Thread t2 = new Thread(()->{
            for(;;){
                synchronized (lock2){
                    System.out.println("获得lock2");
                    synchronized (lock1){
                        System.out.println("获得lock1");
                    }
                }
            }

        });

        t1.start();
        t2.start();
    }
}
