package org.tnsindia.inheritance;
//Parent Class
class AndroidVersion
{
	protected String name="Android latest Version";
	public void display()
	{
		System.out.println(name);
	}
}
//Child Class 1
class Tiramisu extends AndroidVersion
{
	public String v13="Tiramisu";
	public void print()
	{
		System.out.println(v13);
	}
}
//Child Class 2
class SnowCone extends AndroidVersion
{
	public String v12="SnowCone";
	public void display()       //Method Overriding
	{
		System.out.println(v12);
	}
}
public class HierachicalInheritance {

	public static void main(String[] args) {
		Tiramisu t=new Tiramisu();
		t.display();
		SnowCone s=new SnowCone();
		s.display();
		t.print();
	}

}
