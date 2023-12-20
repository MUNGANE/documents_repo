package com.practice.corejava;

import java.util.HashMap;

public class Example1 {

    private Boolean isDuplicatePresent(int[] arr){

        boolean b = true;

        HashMap<Integer ,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i< arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],i);
            }
            else{
                b= false;

            }
        }
        return b;
    }
    public static void main(String[] args){

        Example1 test = new Example1();
        int[] arr1 = {1,2,3,4,5,6,6};
        boolean isDistrict=test.isDuplicatePresent(arr1);
        System.out.println(isDistrict);


    }
}
