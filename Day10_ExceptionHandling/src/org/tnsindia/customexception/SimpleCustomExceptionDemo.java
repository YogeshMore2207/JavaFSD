package org.tnsindia.customexception;

//Example of Custom Exception

@SuppressWarnings("serial")
class SimpleCustomException extends Exception
{
	public String str;
	
	//Constructor
	SimpleCustomException(String str)
	{
		super();
		this.str=str;
	}
	
	@Override
	public String toString()
	{
		return "SimpleCustomException [str=" + str +"]";
	}
}
