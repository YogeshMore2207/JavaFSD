package org.tnsindia.finalkeyword;

class A
{
	//final method
	final void display()
	{
		System.out.println("Final method is inherited but not the override");
	}
}
//Child class inheriting the method of final class
class B extends A
{
	void print()
	{
		System.out.println("Child Class");
	}
}
public class DemoOnFinalMethodInherited {

	public static void main(String[] args)
	{
		B b=new B();
		b.display();
		b.print();

	}

}
