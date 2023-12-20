package com.practice.java8;

import java.util.function.Function;

public class PracticeFunctionalInterface {

    public static void main(String[] args) {
        Function<PersonEntity, PersonDTO> function = (entity) -> {
            return new PersonDTO(entity.getName(), entity.getAge());
        };
       PersonDTO personDTO= function.apply(new PersonEntity("Nikita", 24));
       System.out.println(personDTO.getName()+" "+ personDTO.getAge());

    }
}

class PersonEntity {
    private String name;
    private int age;

    public PersonEntity(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String toString(){
        return name+" "+age;
    }


}
class PersonDTO {
    private String name;
    private int age;

    public PersonDTO(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String toString(){
        return name+" "+age;
    }


}
