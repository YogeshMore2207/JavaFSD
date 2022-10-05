package org.tnsindia.inheritance;

import java.util.Scanner;

//Example of Single Inheritance
//parent class
class Animal
{
	protected String name;
	public void display()
	{
		System.out.println("The animal is:"+name);
	}
}
//child class
class Dog extends Animal
{
	public String breed;
	public void print()
	{
		System.out.println("The the dog breed is:"+breed);
	}
}

public class SingleInheritance {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of the animal:");
		String s1=s.nextLine();
		System.out.println("Enter the breed of the animal:");
		String b1=s.nextLine();
		Dog d=new Dog();
		d.breed=b1;
		d.name=s1;
		d.display();
		d.print();
		s.close();
	}

}
