package com.tns.assignment;

import java.util.Scanner;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=s.nextInt();
		do
		{
			System.out.print(n);
			n++;
			s.close();
		}while(n<=10);


	}

}
