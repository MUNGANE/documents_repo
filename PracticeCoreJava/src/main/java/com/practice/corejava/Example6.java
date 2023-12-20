package com.practice.corejava;

public class Example6 {
    public static int summingSeries(long n) {
        int sum=0;
        if(n==0){
            return 0;
        }
        while(n>0){

            sum = sum +(int) (n*n - (n-1)*(n-1));

        }

        return sum + summingSeries(n-1);
    }
    public static void main(String[] args){
        summingSeries(3);
    }

}

