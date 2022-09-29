package org.tnsindia.defaultconstructor;
//Class Defination

class car
{
	public int speed;
	//method
	void display()
	{
		System.out.println("The Speed is:"+speed+"km/hr");
	}
	//Default Constructor
	//Constructor used to intialize the value of the variables
	car()
	{
		speed=50;
	}
}
public class DefaultConstructorDemo {

	public static void main(String[] args) {
		//Object Creation
		car c = new car();
		c.display();
	}

}
