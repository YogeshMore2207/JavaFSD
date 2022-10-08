package org.tnsindia.finalkeyword;

class FinalClass
{
	protected String name="Yogesh";
}
//Final class cannot be inherited
/*final class FinalClass
{
	protected String name="Yogesh";
}
*/
//child class(Inheritance)
class ChildFinal extends FinalClass
{
	public void print()
	{
		System.out.println(name);
	}
}

public class DemoOnFinalClass {

	public static void main(String[] args)
	{
		ChildFinal c=new ChildFinal();
		c.print();
		

	}

}
