package org.tnsindia.lamdaexpdemo;

public class FunctionalInterfaceExampleExecutor {

	public static void main(String[] args)
	{
		FunctionalInterfaceExample obj = (int a, int b)->
		{
			int result = (a>b)?a:b;
			return result;
		};
		System.out.println("The maximum nuber is: "+obj.max(65,99));

	}

}
