package org.tnsindia.array;

public class Varargs 
{
	//Variable Argument ...(Ellipse)
	static void print(int a, int b, String... s)
	{
		System.out.println(a+","+b);
		//TO PRINT VARARGS
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]+"\t");
		}
	}
	public static void main(String[] args) 
	{
		print(13,16,"Python","Java","11");

	}

}

