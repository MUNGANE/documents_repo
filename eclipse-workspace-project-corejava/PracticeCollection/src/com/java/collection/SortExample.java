package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		//comparable and compareTo diff
		ArrayList<Employee> emp= new ArrayList<>();
		emp.add(new Employee(1,"Nikita"));
		emp.add(new Employee(2,"Akash"));
		emp.add(new Employee(3,"Ashwini"));
		System.out.println(emp);
		//Collections.sort(emp);  //internally it does not know how to sort this onject
		//comparable
		// uses natural sorting order
		
		Collections.sort(emp);
		System.out.println(emp);
		//but in this case you can only sort object based on any one data either id or name to solve this lets see comparator
		
		
		
		//comparator
		//uses customise sorting order
		Collections.sort(emp, new IdComparator());
		System.out.println(emp);
		
		
		Collections.sort(emp, new NameComparator());
		System.out.println(emp);

	}

}
