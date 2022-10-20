package org.tnsindia.setdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args)
	{
		//Set is an interface, we can't create the object for the set
		//Set s = new Set<>();
		//@SuppressWarnings("rawtypes")
		//1.HashSet is unordered and it does not contain duplicate element
		//2.Set contain at most one null element
		Set<Object> s = new HashSet<>();
		s.add("Yogesh");
		s.add('Y');
		s.add(34.11f);
		s.add(55);
		s.add(null);
		s.add("Yogesh");
		System.out.println("The element in the set are: "+s);
	}

}
