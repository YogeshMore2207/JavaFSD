package org.tnsindia.statickeyword;

class B
{
	//non-static method
	int add(int a,int b)
	{
		return a+b;
	}
	//static method
	public static void display()
	{
		System.out.println("Welcome to java full stack training");
	}
}

public class DemoOnStaticMethod {

	public static void main(String[] args) 
	{
		/*without creating any object for a class we can access
		  that method by making that method as static
		 classname.methodname();
		 */
		B.display();
		
	}

}
