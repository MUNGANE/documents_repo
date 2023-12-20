package com.practice;

import java.util.Arrays;

public class BinarySerach {

    public static void searchElement(int[] arr,int n){
        Arrays.sort(arr);
        int mid = arr.length/2;
        if(arr[mid]>n){

        }
        else if(arr[mid]==n){
            System.out.println("element found at index "+mid);
        }
        else{

        }

    }
}
