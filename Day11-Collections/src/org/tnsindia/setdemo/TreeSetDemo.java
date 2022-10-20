package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{
		SortedSet<String> s = new TreeSet<>();
		s.add("Yogesh");
		s.add("Abhay");
		s.add("Rutvik");
		s.add("Pratik");
		System.out.println("The element in the TreeSet are: "+s);
	}

}
