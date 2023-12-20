package com.practice.java8;

import java.util.function.Function;

public class PracticeRefeMethode {
    public void saySomething(){
         System.out.println("Helloo Nikita......!!");
    }

    public static void main(String[] args){
        PracticeRefeMethode obj1 = new PracticeRefeMethode();
        Sayable s = obj1::saySomething;
        s.say();
    }
}
interface Sayable{
    void say();
}
