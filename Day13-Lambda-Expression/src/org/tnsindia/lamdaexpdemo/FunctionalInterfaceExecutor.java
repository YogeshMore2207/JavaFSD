package org.tnsindia.lamdaexpdemo;

public class FunctionalInterfaceExecutor {

	public static void main(String[] args) 
	{
		//Lambda Expression
		FunctionaIInterfaceDemo  obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("Welcome to the concept of Lambda Expression"));
		
	}

}
