package org.tnsindia.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet is follows the insertion order
public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		Set<Object> s = new LinkedHashSet<>();
		s.add("Yogesh");
		s.add('Y');
		s.add(34.11f);
		s.add(55);
		s.add(null);
		s.add("Yogesh");
		//To extract the elements from set
		for(Object str:s)
		{
			System.out.println("The element in the set are: "+str);
		}
		System.out.println("The element in the set are: "+s);
	}

}
