package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreamAPI {
    public static void main(String[] args){
        Integer[] arr = new Integer[]{1,2,3,4};
        Stream<Integer> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
        //List<Integer> l = stream.filter(a -> a%2==0).collect(Collectors.toList());
        Arrays.stream(arr).filter(x -> x%2 ==0).forEach(y -> System.out.println(y));
        //System.out.println(l);
    }
}
