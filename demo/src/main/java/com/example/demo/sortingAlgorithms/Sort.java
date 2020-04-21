package com.example.demo.sortingAlgorithms;

import java.util.Arrays;

public class Sort {
    public static int[] bubbleSort(int arr[]){
        int temp =0;

        for(int i=0; i<=arr.length-1; i++){
            for (int j=0;j<=arr.length-1-1; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void print(int[] array, String nameOfSort){
        System.out.println(nameOfSort+ "-> "+Arrays.toString(array));
        System.out.println("--------------***************--------------**************-------------");
    }

    public static int[] selectionSort(int arr[]){

        for (int i=0;i<arr.length-1;i++) {
            int min =arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    arr[j]= arr[i];
                    arr[i]= min;
                }
            }

        }

        return arr;
    }

    public static int[] insertionSort (int arr[]){

        int temp,j;
        int count =0;
        for (int i=1;i<=arr.length-1;i++) {
            temp=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            System.out.println(Arrays.toString(arr));
            arr[j+1]=temp;
            count++;
            System.out.println(count + "-> "+Arrays.toString(arr));
        }
        return arr;
    }

}
