package com.practice.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice2 {
    public  int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=arr.size()-k;i++){
            int min= arr.get(i);
            int max=arr.get((i+k)-1);
            int diff= max-min;
            list.add(diff);
            if(i==0){
                continue;
            }
            if(list.get(1)<list.get(0)||list.get(1)==list.get(0)){
                list.remove(0);
            }
            else{
                list.remove(1);
            }
        }
        return list.get(0);
    }
    public static void main(String[] args){
        int x = 3;
        List<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(350);
        l.add(400);
        l.add(401);
        l.add(402);
        Practice2 p = new Practice2();
        int z =p.maxMin(x,l);
        System.out.println(z);


    }
}
