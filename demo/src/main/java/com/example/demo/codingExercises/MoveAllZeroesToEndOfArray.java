package com.example.demo.codingExercises;

import java.util.Arrays;

public class MoveAllZeroesToEndOfArray {

    public static void move(int [] array){
        System.out.println(Arrays.toString(array));
        int count = 0;

        for (int i = 0; i< array.length; i++) {
            if(array[i]!=0){
                array[count++]=array[i];
            }
        }

        while(count<array.length){
            array[count++]=0;
        }

        System.out.println(Arrays.toString(array));
    }
}
