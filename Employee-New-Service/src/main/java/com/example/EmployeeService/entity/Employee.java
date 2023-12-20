package com.example.EmployeeService.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employeedetails")
public class Employee {


    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="EmpID")
    private int ID;

    @Column(name="EmpName")
    private String name;

    @Column(name="EmpEmail")
    private String email;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Employee(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }
}
