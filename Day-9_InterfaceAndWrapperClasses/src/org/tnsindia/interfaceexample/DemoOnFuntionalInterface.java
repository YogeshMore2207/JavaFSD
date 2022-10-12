package org.tnsindia.interfaceexample;

//Example on FunctionalInterface
/*We can use the @FunctionalInterface annotation to ensure that there is
 not more than one abstract method in a functional interface. */

interface FunctionalInterface
{
	//FunctionalInterface contains exactly one abstract method
	void accept(String msg);
}

class FunctionalInterfaceExample implements FunctionalInterface
{
	public void accept(String msg)
	{
		System.out.println(msg);
	}
}
public class DemoOnFuntionalInterface 
{
	public static void main(String[] args)
	{
		FunctionalInterfaceExample f=new FunctionalInterfaceExample();
		f.accept("Hello");
	}

}
