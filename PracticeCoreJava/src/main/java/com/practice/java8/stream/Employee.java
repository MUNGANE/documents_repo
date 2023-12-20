package com.practice.java8.stream;

import java.util.List;

public class Employee {
    public int id;
    public String name;
    public String address;
    public List<String> courses;

    public Employee(int id, String name, String address, List<String> courses) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.courses = courses;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", courses=" + courses +
                '}';
    }
}
