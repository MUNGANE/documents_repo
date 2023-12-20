package com.practice.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static  void main(String[] args){
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee(1,"Nikita","Achalpur", Arrays.asList("java","python")));
        al.add(new Employee(2,"Aditya","Amaravti",Arrays.asList("C,C++")));
        al.add(new Employee(3,"Vahin","Pune",Arrays.asList("Angular","react")));
        al.add(new Employee(4,"Akash","Nagpur",Arrays.asList("java","AWS")));
        //System.out.println(al);

        List<String> upperName = al.stream().map(e-> e.getName().toUpperCase()).collect(Collectors.toList());
        //List<String>  filtername =al.stream().filter(e->e.getName().length()==5).peek(e->System.out.println(e.getName())).map(e->e.getName().toUpperCase()).skip(1).collect(Collectors.toList());

        //System.out.println(filtername);

        List<String> s=al.stream().flatMap(e->e.getCourses().stream()).distinct().collect(Collectors.toList());
        //System.out.println(s);

        List<Integer> sortedem=al.stream().map(e->e.getId()).sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
        //System.out.println(sortedem);

        Optional<Integer> i= al.stream().map(e->e.getId()).max((o1,o2)->o1.compareTo(o2));
        System.out.println(i);

        Stream.empty();








    }
}
