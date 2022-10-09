package org.tnsindia.overloading;

//Demo on method overloading by passing the different data types

class MathematicalOperation
{
	//Method Overloading
	public void addition(int a,int b)
	{
		System.out.println("The sum is: "+(a+b));	
	}
	public void addition(float a,float b)
	{
		System.out.println("The sum is: "+(a+b));	
	}
	
}
public class DemoOnMethodOverloading {

	public static void main(String[] args)
	{
		MathematicalOperation m=new MathematicalOperation();
		m.addition(10, 45);
		m.addition(12.0f,33.5f);
	}

}
