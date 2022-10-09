package org.tnsindia.stringbuilder;

public class Example4 
{
	public static void main(String[] args) 
	{
		StringBuilder s=new StringBuilder();
		System.out.println(s.capacity());
		s.append("Good");
		System.out.println(s.capacity());
		s.append("Java is my favourite language");
		System.out.println(s.capacity());
	}


}
