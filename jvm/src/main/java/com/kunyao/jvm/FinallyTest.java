package com.kunyao.jvm;

public class FinallyTest {

    public static String getTest(){
        String s;
        try{
            s = "11111111111";
            return s;
        }finally {
            s = "22222";
        }
    }

    public static void main(String[] args){
        System.out.println(getTest());
    }
}
