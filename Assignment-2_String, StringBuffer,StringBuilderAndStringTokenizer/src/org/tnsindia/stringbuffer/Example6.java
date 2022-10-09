package org.tnsindia.stringbuffer;

public class Example6 {

	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("Jeva");
		System.out.println(s);
		System.out.println(s.charAt(1));
		s.setCharAt(1, 'a');
		System.out.println(s);
		System.out.println(s.charAt(1));

	}

}
