package org.tnsindia.stringbuilder;

public class Example3 {

	public static void main(String[] args)
	{
		String str="Hello";
		StringBuilder s=new StringBuilder(str.length());
		System.out.println(s.capacity());
	}

}
