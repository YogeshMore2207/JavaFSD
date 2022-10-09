package org.tnsindia.statickeyword;
// Static Keyword with variable
class A
{
	static int a=56;
}
public class DempOnStaticVariable 
{
	/*If we declare any variable outside the main function and we print that var without static
	 * then we will get the error.... for that purpose we have to use static keyword
	 */
	static int a=56;
	public static void main(String[] args)
	{
		System.out.println(a);
	}

}
