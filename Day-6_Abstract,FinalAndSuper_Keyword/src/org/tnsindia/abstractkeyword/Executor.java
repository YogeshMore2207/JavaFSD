package org.tnsindia.abstractkeyword;

public class Executor {

	public static void main(String[] args)
	{
		Person p=new Employee("Rutvik","Male",5467);
		Person p1=new Employee("Pratik","Male",5461);
		System.out.println(p.toString());
		p.work();
		p1.work();
		p.changeName("Abhay");
		System.out.println(p.toString());
		System.out.println(p1.toString());
	}

}
