package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) 
	{
		List<Integer> obj = Arrays.asList(new Integer[] {44,54,85,12,55});
		Optional<Integer> obj1 = obj.stream().reduce((a,b)->a>b?a:b);
		if(obj1.isPresent())
		{
			System.out.println(obj1.get());
		}
	}

}
