package com.kunyao.arithmetic.sort;

import java.util.stream.Stream;

public class BubbleSort implements Sort{
    @Override
    public Comparable[] sort(Comparable[] values) {
        for (int i=0;i<values.length-1;i++){

            for(int j=0;j<values.length-1-i;j++){
                if(values[j].compareTo(values[j+1])>0){
                    Comparable tmp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = tmp;
                }
            }
        }
        return values;
    }

    public static void main(String[] args){
        Integer[] values = new Integer[]{6, 7, 8, 3, 0, 14, 2};
//        values = new Integer[]{3,1,2,5,4};
        values = (Integer[]) new BubbleSort().sort(values);
        Stream.of(values).forEach(System.out::println);
    }
}
