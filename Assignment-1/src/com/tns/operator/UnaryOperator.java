package com.tns.operator;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int x=a++;
		int z=x+b;
		System.out.println(z);
		s.close();
		

	}

}
