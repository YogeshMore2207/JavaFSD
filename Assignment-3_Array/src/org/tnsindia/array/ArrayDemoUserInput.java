package org.tnsindia.array;

import java.util.Scanner;

public class ArrayDemoUserInput {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter size of the array: ");
		int size = s.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter the values ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter the value at "+i+" index");
			arr1[i] = s.nextInt();
		}
		System.out.println("Values of the array are:");
		/*for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}*/
		//Or we can use enhance for loop
		for(int i:arr1)
		{
			System.out.println(i);
			s.close();
		}
	}

}
