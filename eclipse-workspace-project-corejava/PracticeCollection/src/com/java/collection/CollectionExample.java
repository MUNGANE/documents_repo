package com.java.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class CollectionExample {

	public static void main(String[] args) {
		HashMap<String,Integer> friends = new HashMap<>();
		friends.put("Nikita", 1);
		friends.put("Akash", 2);
		friends.put(null, 3);
		friends.put("Nikita", 4);
		friends.put("akash", 4);
		friends.put("riya", 4);
		friends.put("riya", 6);
		
		
		Hashtable<String,Integer> t = new Hashtable<>();
		t.put("nikita", 12);
		t.put("akash", 13);
		t.put(null, 14);//error
		System.out.println(t);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(friends);

	}

}
