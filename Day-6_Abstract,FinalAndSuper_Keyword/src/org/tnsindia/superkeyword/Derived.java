package org.tnsindia.superkeyword;

public class Derived extends Base
{
	//Default Constructor
	Derived()
	{
		System.out.println("Child Class Constructor-Default");	
	}
		//Parameterized Constructor
		Derived(int i)
		{
			super(i);
			System.out.println("Parent Class Constructor-Paremeterized");
		}

}
