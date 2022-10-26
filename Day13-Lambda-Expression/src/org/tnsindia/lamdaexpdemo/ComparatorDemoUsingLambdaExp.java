package org.tnsindia.lamdaexpdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Comparator is an interface

public class ComparatorDemoUsingLambdaExp {

	public static void main(String[] args)
	{
		Comparator<String> obj = (s1,s2)->Integer.compare(s1.length(), s2.length());
		String str[] = {"Yogesh", "Tejas", "Rutvik","Abhay"};
		//Arrange into ascending order
		Collections.sort(Arrays.asList(str),obj);
		//Enhanced for loop
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
