package com.raxrot.task4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3,3,3,3};
        int [] distinct= Arrays.stream(arr).distinct().toArray();
        for(int i=0;i<distinct.length;i++){
            System.out.println(distinct[i]);
        }
    }
}
