package com.kunyao.arithmetic;

public class Increment {
    public static void main(String[] args){
        int i=0;
        int temp1 = i++;
        int temp2 = ++i;

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(i);
        for(int j=0;j<100;j++){
            System.out.println(++i);
        }
        System.out.println(i);
    }
}
