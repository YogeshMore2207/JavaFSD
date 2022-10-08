package org.tnsindia.superkeyword;

//super class
class Parent
{
	public void print()
	{
		System.out.println("Welcome to M25 Batch");
	}
	public void accept()
	{
		System.out.println("Super class method");
	}
}
//child class
class Child extends Parent
{
	//method overriding
	public void print()
	{
		System.out.println("Congratulation on selection in screening");
	}
	public void accept()
	{
		System.out.println("Child class method");
	}
	public void display()
	{
		print();
		accept();
		//calling the parent class method
		super.print();
		super.accept();
	}
}
public class DemoOnSuperClassMethod {

	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();
	}

}
