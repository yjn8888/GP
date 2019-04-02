package com.kunyao.juc;

import java.util.concurrent.Semaphore;

public class CurrentLimiting {

    static Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args){

            Thread t1 = new Thread(()->{
                for(;;) {
                    try {
                        semaphore.acquire();
                        System.out.println("t1输出=================");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
//                        semaphore.release();
                    }
                }
            });
        Thread t2 = new Thread(()->{
            for(;;) {
                try {
                    semaphore.acquire();
                    System.out.println("t2输出=================");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
//                    semaphore.release();
                }
            }
        });
        Thread t3 = new Thread(()->{
            for(;;) {
                try {
                    semaphore.acquire();
                    System.out.println("t3输出=================");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
//                    semaphore.release();
                }
            }
        });
        Thread t4 = new Thread(()->{
            for(;;) {
                try {
                    semaphore.acquire();
                    System.out.println("t4输出=================");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
