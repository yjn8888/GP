package com.kunyao.arithmetic.sort;

public class InsertSort implements Sort{
    @Override
    public Comparable[] sort(Comparable[] values) {
        for (int i=1;i<values.length;i++){
            for(int j=0;j<i;j++){
                if(values[i].compareTo(values[j])<0){
                    Comparable tmp = values[i];
                    values[i] = values[j];
                    values[j] = tmp;
                }
            }
        }
        return values;
    }

    public static void main(String[] args){
        Integer[] values = new Integer[]{6, 7, 8, 3, 0, 14, 2, 9};
        values = (Integer[]) new InsertSort().sort(values);
        for (Integer i:values) {
            System.out.println(i);

        }
    }


}
