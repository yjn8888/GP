package com.kunyao.jvm;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class JvmConfig {

    public static void main(String[] args){
        List<GarbageCollectorMXBean> garbageCollectorMXBeanlist = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean garbageCollectorMXBean:garbageCollectorMXBeanlist) {
            System.out.println(garbageCollectorMXBean.getName());
        }
    }
}
