package com.tns.operator;

import java.util.Scanner;

public class TernoryOperator {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value: ");
		int a=s.nextInt();
		String res=(a%2==0)? "Even":"odd";
		System.out.println("Value is: "+res);
		s.close();

	}

}
