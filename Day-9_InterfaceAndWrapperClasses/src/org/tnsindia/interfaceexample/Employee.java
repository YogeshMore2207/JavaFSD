package org.tnsindia.interfaceexample;

//child class

public class Employee implements HR,Manager
{
	@Override
	public void projectdiscussion()
	{
		System.out.println("About the Project Discussion");
	}
	@Override
	public void salarydiscussion()
	{
		System.out.println("About the Salary Discussion");
	}
}
