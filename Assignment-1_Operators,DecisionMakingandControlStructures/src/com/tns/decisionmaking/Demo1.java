package com.tns.decisionmaking;
// Example of If-Else 
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values: ");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b)
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("B is greater");
		}
		s.close();

	}

}
