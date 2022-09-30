package org.tnsindia.abstraction;
//Demo on public access specifier
class B
{
	public String dob="22-07-2002";
	public void Display() 
	{
		System.out.println("The DOB is: "+dob);
	}
}
public class DemoOnPublic {

	public static void main(String[] args) {
		B b=new B();
		b.Display();
	}

}
