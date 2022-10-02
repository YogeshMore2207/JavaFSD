package com.tns.decisionmaking;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter character between a to d ");
		char a=s.next().charAt(0);
		switch(a)
		{
		case 'a':
			System.out.println("Erangle");
			break;
		case 'b':
			System.out.println("Miramar");
			break;
		case 'c':
			System.out.println("Sanhok");
			break;
		case 'd':
			System.out.println("Livik");
			break;
		default:
			System.out.println("Invalid Input");
		}
		s.close();

	}

}
