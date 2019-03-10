package com.kunyao.arithmetic;

import java.lang.reflect.Field;

public class IntegerBug {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer a=1,b=2;
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
    public static void swap(Integer a,Integer b) throws NoSuchFieldException, IllegalAccessException {
        int tmp = a.intValue();
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        field.set(a,b.intValue());
        field.set(b,tmp);

    }

}
