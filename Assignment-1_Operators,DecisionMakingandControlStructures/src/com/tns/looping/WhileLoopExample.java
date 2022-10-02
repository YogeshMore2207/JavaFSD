package com.tns.looping;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=s.nextInt();
		while(n<=50)
		{
			System.out.print(n);
			n++;
			s.close();
		}

	}

}
