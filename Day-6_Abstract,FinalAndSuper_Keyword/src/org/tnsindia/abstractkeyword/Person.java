package org.tnsindia.abstractkeyword;

public abstract class Person 
{
	private String name;
	private String gender;
	//Parameterized Constructor
	public Person(String name,String gender)
	{
		super();
		this.name=name;
		this.gender=gender;
	}
	//Abstract Class
	public abstract void work();
	//toString method
	@Override
	public String toString()
	{
		return "Person[name="+ name +", gender="+ gender +"]";
	}
	//user-defined method for change the name
	public void changeName(String newName)
	{
		name=newName;
	}


}
