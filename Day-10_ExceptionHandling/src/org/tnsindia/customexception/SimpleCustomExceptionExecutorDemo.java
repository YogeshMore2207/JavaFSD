package org.tnsindia.customexception;

import java.util.Scanner;

public class SimpleCustomExceptionExecutorDemo 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User ID: ");
		String id = s.nextLine();
		System.out.println("Enter Password: ");
		String password  = s.nextLine();
		try
		{
			if(id!="Yogeshmore123" && password!="123@abc")
				throw new LoginCredentials("Invalid Credentials");
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled"+e);
			
		}
		
	}

}
