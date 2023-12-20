package com.practice.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example4 {
    public static List<Integer> countingSort(List<Integer> arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(arr) ;

        Collections.sort(temp);

        int l = temp.get(temp.size()-1);

        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        while (i <= l) {
            al.add(0);
            i++;
        }
        System.out.println(al);
        for (int j : arr) {
            int k = al.get(j);
            k = k + 1;
            al.add(j, k);
        }
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(13);
        a.add(14);
        a.add(1);
        a.add(8);
        a.add(9);
        a.add(1);
        a.add(12);
        a.add(13);
        System.out.println(countingSort(a));

    }
}
