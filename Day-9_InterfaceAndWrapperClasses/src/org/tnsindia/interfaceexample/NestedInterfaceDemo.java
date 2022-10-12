package org.tnsindia.interfaceexample;

import java.util.Scanner;

//3.Program on Nested-Interface
//Outer Interface
interface InterfaceOuter
{
	//Abstract method by default
	void print();
	//Inner interface
	interface InnerInterface
	{
		//Abstract method by default
		void display();
	}
}
class ImplementableClass implements InterfaceOuter.InnerInterface
{
	@Override
	public void display()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the batch: ");
		String str = s.nextLine();
		System.out.println("The batch is: "+str);
		s.close();
	}
}
class ImplementableClassp implements InterfaceOuter
{
	@Override
	public void print()
	{
		System.out.println("Working on Nested Interface");
	}
}
public class NestedInterfaceDemo {

	public static void main(String[] args) 
	{
		ImplementableClass i = new ImplementableClass();
		i.display();
		ImplementableClassp i1 = new ImplementableClassp();
		i1.print();
	}

}
