package org.tnsindia.Parameterizedconstructor;

import java.util.Scanner;

//Demo on Parmeterized Constructor

class Bike
{
	public int speed;
	//ParmeterizedConstructor
	Bike(int s)
	{
		speed = s;
		System.out.println("The speed is:"+s+"km/hr");
	}
}
public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of speed: ");
		int speed = s.nextInt();
		Bike b = new Bike(speed);
		s.close();

	}

}
