package org.tnsindia.strings;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the name: ");
		Scanner s=new Scanner(System.in);
		String str=new String(s.nextLine());
		System.out.println(str);
		s.close();

	}

}
