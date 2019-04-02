package com.kunyao.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.TimeUnit;

public class PermGen {

    static Object ref = new Object();

    public static void main(String[] args) throws InterruptedException {

        Object s = new Object();
        System.out.println(s);
        System.out.println(ref);
        ReferenceQueue queue = new ReferenceQueue();
//        PhantomReference pr = new PhantomReference(ref,queue);
        PhantomReference pr1 = new PhantomReference(s,queue);
        ref=null;
        s = null;
        System.gc();
        TimeUnit.MILLISECONDS.sleep(10);
        System.out.println(pr1);
        System.out.println(queue.poll().isEnqueued());


    }
}
