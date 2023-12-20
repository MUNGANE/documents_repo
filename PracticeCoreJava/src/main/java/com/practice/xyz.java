package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class xyz {
    public static void main(String[] args){
        StringJoiner s1 = new StringJoiner(",","[","]");
        s1.add("nikita");
        s1.add("Aditya");
        System.out.println(s1);
        StringJoiner s2 = new StringJoiner(":","[","]");
        s2.add("nikita");
        s2.add("Aditya");
        System.out.println(s2);
        StringJoiner s3=s1.merge(s2);
        System.out.println(s3);


    }



}
