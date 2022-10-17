package org.tnsindia.array;

import java.util.Arrays;

public class UsingArray 
{
	static void display(int... a)
	{
		//Arrays.sort defines array is class and sort is method which sort the values
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		display(10,55,44,1,6,87,99);
	}

}
