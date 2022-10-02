package com.tns.decisionmaking;

import java.util.Scanner;

//Example of Nested If-Else 
public class Demo3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age and Weight: ");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=120)
				{
					System.out.println("Eligible to bunjee jumping");
				}
				else
				{
					System.out.println("Extra ropes will be added");
				}
				
			}
			else
			{
				System.out.println("Not eligible for bunjee jumping");
			}
		}
		else
		{
			System.out.println("Not eligible for bunjee jumping");
		}

	s.close();
	}

}
