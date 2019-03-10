package com.kunyao.arithmetic.sort;

import java.util.stream.Stream;

public class SelectionSort implements Sort<Integer>{
    @Override
    public Integer[] sort(Integer[] values) {
        int n = values.length;
        for (int i=0;i<n-1;i++){
            int x = i+1;
            for(int j=i+1;j<n-1;j++){
                if(values[x].compareTo(values[j+1])>0){
                    x = j+1;
                }
            }
            if(values[i].compareTo(values[x])>0){
                int tmp = values[i];
                values[i]= values[x];
                values[x] = tmp;
            }
        }
        return values;
    }

    public static void main(String[] args){
        Integer[] values = new Integer[]{6, 7, 8, 3, 0, 14, 2};
//        values = new Integer[]{3,1,2,5,4};
        values = (Integer[]) new SelectionSort().sort(values);
        Stream.of(values).forEach(System.out::println);
    }
}
