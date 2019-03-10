package com.kunyao.current;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 错误的
 */
public class ThreeThread {

    public static void main(String[] args){
        Lock lock = new ReentrantLock();
        Condition c1 = lock.newCondition();
        Condition c2 = lock.newCondition();
        Condition c3 = lock.newCondition();
        Thread t1 = new Thread(()->{
            for(;;){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try{
                    lock.lock();
                    System.out.println(Thread.currentThread()+":aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                    c2.signal();
                    c1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        });
        Thread t2 = new Thread(()->{
            for(;;){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try{
                    lock.lock();
                    System.out.println(Thread.currentThread()+":bbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
                    c3.signal();
                    c2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        });
        Thread t3 = new Thread(()->{
            for(;;){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try{
                    lock.lock();
                    System.out.println(Thread.currentThread()+":cccccccccccccccccccccccccc");
                    c1.signal();
                    c3.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        });
        t1.start();
        t2.start();
        t3.start();

    }


}
