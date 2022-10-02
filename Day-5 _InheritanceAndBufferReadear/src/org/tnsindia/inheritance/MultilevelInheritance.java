package org.tnsindia.inheritance;
//Multilevel Inheritance
//Parent Class
class Vehicle
{
	protected String name="Car";
	//If this method is private we cannot access into another class
	public void display()
	{
		System.out.println(name);
	}
}
//Child Class
class BMW extends Vehicle
{
	protected String name="BMW";
	public void display1()
	{
		System.out.println(name);		
	}
}
//Child class for BMW
class Tyre extends BMW
{
	protected String tyrename="MRF";
	public void display2()
	{
		System.out.println(tyrename);		
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Tyre t=new Tyre();
		t.display();
		t.display1();
		t.display2();

	}

}
