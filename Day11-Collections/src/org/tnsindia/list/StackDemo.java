package org.tnsindia.list;

import java.util.Stack;

//Demo on Stack-LIFO
public class StackDemo {

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<>();
		//Push-Insertion
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		//Pop-Deletion
		s.pop();
		//s.remove(0); - it delete 0th index element
		System.out.println(s);
	}

}
