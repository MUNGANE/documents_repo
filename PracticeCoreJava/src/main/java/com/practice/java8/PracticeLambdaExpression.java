package com.practice.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PracticeLambdaExpression {

    public static void main(String[] args){
        ArrayList<Person> l = new ArrayList<>();
        l.add(new Person("Nikita",24));
        l.add(new Person("Aditya",18));
        l.add(new Person("Vahin",4));

        Collections.sort(l,(Person p1,Person p2)->{return p1.getAge()-p2.getAge();});
        System.out.println("List after sorting");
        for(Person p :l){
            System.out.println(p);
        }


    }
}
class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        super();
        this.name= name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setname(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString(){
        return name+" "+age;
    }

}
