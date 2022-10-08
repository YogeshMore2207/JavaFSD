package org.tnsindia.abstractkeyword;

abstract class C
{
	//Abstract Class can have abstract and non-abstract method
	//non-abstract method
	void print()
	{
		System.out.println("Non-abstract method");
	}
	abstract void display();
	abstract void accept();

}
/*we can't create the object for abstract class to call the method and to provide
 the implementation we must have define child class*/
class D extends C
{
	@Override
	void display()
	{
		System.out.println("Abstract Method 1");
	}
	@Override
	void accept()
	{
		System.out.println("Abstract Method 2");
	}
	
}
public abstract class DemoOnAbstractClass 
{
	public static void main(String[] args)
	{
		C c=new D();
		c.print();
		c.display();
		c.accept();
	}

}
