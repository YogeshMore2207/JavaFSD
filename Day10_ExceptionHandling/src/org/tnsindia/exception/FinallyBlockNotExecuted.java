package org.tnsindia.exception;

public class FinallyBlockNotExecuted 
{
	//It is static because its is outside the main function
	public static void print()
	{
		try
		{
			int x = 12;
			int y = 5;
			System.out.println("Inside try block: "+x/y);
			//1.No any further statement will execute
			System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		/*2.When Final block contains exceptional code, it won't executed.
		finally
		{
			//System.out.println("Finally Block");
			 int res = 14/0
			 System.out.println(res);
		}*/
	}

	public static void main(String[] args) 
	{
		print();
	}

}
