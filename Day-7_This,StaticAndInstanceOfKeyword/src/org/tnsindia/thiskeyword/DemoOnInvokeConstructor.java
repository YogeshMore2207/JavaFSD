package org.tnsindia.thiskeyword;

//4.This keyword invoking the current class constructor

class D
{
	//Default Constructor
	D()
	{
		//This keyword invoking the current class constructor
		this(5);
		System.out.println("Default Constructor");
	}
	D(int i)
	{
		System.out.println("Parameterized Constructor");
	}
}
public class DemoOnInvokeConstructor {

	public static void main(String[] args) 
	{
		D d=new D();
	}

}
