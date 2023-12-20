package com.practice.corejava;

import java.util.ArrayList;

public class Example5 {
    public static long candies(int n, ArrayList<Integer> arr) {
        System.out.println(arr);
        ArrayList<Integer> al = new ArrayList<>();
        int sum=0;
        int count=1;
        int temp=0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                if(arr.get(i)>arr.get(i-1)){
                    count=count+1;
                    al.add(count);
                    break;
                }
                else{
                    al.add(1);
                    break;
                }
            }
            int j=i;

            while(arr.get(j)>arr.get(j+1)){
                count++;
                j++;
                if(j==n-1){
                    break;
                }
                temp++;
            }
            if(temp>0) {
                al.add(count);
            }
            else{
                count=count+1;
                al.add(count);
            }
            count=1;
            temp=0;

        }

        System.out.println(al);
        for(int i :al){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(2);
        a.add(6);
        a.add(1);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(2);
        a.add(1);
        System.out.println(candies(10,a));

    }

}


