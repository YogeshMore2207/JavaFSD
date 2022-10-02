package com.tns.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values: ");
		int a=s.nextInt();
		int b=s.nextInt();
		boolean res=(a!=b);
		System.out.println(res);
		s.close();
	}

}
