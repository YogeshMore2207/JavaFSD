package org.tnsindia.customexception;

//Custom Exception for validating the login credentials

@SuppressWarnings("serial")
class LoginCredentials extends Exception
{
	public String str;
	
	//Constructor
	LoginCredentials(String str)
	{
		super();
		this.str=str;
	}
	
	@Override
	public String toString()
	{
		return "LoginCredentials [str=" + str +"]";
	}
}
