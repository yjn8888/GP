package com.kunyao.juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

import static com.kunyao.juc.CutdownLunchTest.cdl;

public class CyclicBarrierTest {
   static CyclicBarrier cb = new CyclicBarrier(4, new Runnable() {
       @Override
       public void run() {
           System.out.println(Thread.currentThread()+":四个线程执行完毕============");
       }
   });

   public static void main(String[] args) throws InterruptedException {
       for(int i=0;i<16;i++){

           new CyclicBarrierThread(cb).start();
           TimeUnit.SECONDS.sleep(1);
       }


   }

    static class CyclicBarrierThread extends Thread{
        CyclicBarrier cb ;

        public CyclicBarrierThread(CyclicBarrier cb){
            this.cb = cb;
        }

        public void run(){
            try {
                cb.await();
                for (;;){
                    System.out.println(Thread.currentThread()+"线程执行===========");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
