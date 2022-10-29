package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilteringMethodDemo {

	public static void main(String[] args)
	{
		List<Integer> obj1 = Arrays.asList(new Integer[] {50,60,40,99});
		//Filter() method
		obj1.stream().filter(i->i>50).forEach((i)->System.out.println(i+" "));
		System.out.println();
		//Distinct() method
		obj1.stream().distinct().forEach((i)->System.out.println(i+" "));
		System.out.println();
		//Limit(n)
		obj1.stream().limit(3).forEach((i)->System.out.println(i+" "));
		System.out.println();
		//Skip(n)
		obj1.stream().skip(2).forEach((i)->System.out.println(i+" "));
	}

}
