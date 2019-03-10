package com.kunyao.current;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class ParkTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{

                System.out.println("开始执行park==========");
                LockSupport.park();
                Thread.interrupted();
            for(;;) {
                System.out.println("唤醒后再执行==========");
            }
//                LockSupport.park();
//                Thread.interrupted();
//                System.out.println("唤醒后跳出==========");
//                break;
        });

        t1.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(t1.getState());
//        LockSupport.unpark(t1);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("执行interrupt");
//        t1.interrupt();

    }
}
