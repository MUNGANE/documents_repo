package com.practice.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args){
        Optional<String> op4= Optional.of("");
        System.out.println(op4);
        Optional<String> op =  Optional.ofNullable("Nikita");
        System.out.println(op.orElseGet(()-> "vahin"));
        Optional<String> op1 =  Optional.ofNullable(null);
        System.out.println(op1);
        //System.out.println(op1.orElse("Akash"));
        op.ifPresentOrElse(
                (value)-> {System.out.println(value);},
        ()->{System.out.println("Aditya");});

        System.out.println(op1.orElseGet(()->"Vahin"));
        //System.out.println(op1.orElseThrow(  NoSuchElementException::new));
        List<String> name= new ArrayList<>();
        name.add("Pooja");
        name.add("Priya");
        name.add("durga");
        Optional<List<String>> op3 = Optional.ofNullable(name);
        System.out.println(op.filter(s->s.startsWith("A")));
        System.out.println(op3);


        String[] names ={"Nikita","Aditya","Vahin","Akash"};
        Optional<String[]> op2 =  Optional.ofNullable(names);
        System.out.println(op2.map(x->x.length));







    }
}
