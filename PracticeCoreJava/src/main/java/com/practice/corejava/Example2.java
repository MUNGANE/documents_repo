package com.practice.corejava;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Example2 {

    static int minimumDeletions(int[] a){
        int count=0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int j:a){
            al.add(j);
        }
        System.out.println(al);
        for(int i=0;i<al.size()-3;i++){
            int a1=(Integer) al.get(i);
            int b=(Integer) al.get(i+1);
            int c=(Integer) al.get(i+2);
            if(a1>b||a1<b){
                if(b>c || b<c){
                    al.remove(i+2);
                    count++;
                }
                else{
                    continue;
                }
            }

        }
        return count;
    }


    public static void main(String[] args) {
       int[] a= {3,7,9,7,0};
        // Return the minimum number of elements to delete to make the array zigzag
        int result = minimumDeletions(a);
        System.out.println(result);
    }
}
