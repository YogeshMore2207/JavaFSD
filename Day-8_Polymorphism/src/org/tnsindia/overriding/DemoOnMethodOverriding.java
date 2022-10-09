package org.tnsindia.overriding;

import java.util.Scanner;

//parent class

class HeadQuarters
{
	protected int totalemp;
	protected String city;
	Scanner s=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter the city where HeadQuarter is situated: ");
		city=s.nextLine();
		System.out.println("Enetr the total no.of employees in the city headquarters");
		totalemp=s.nextInt();
	}
	public void showDetails()
	{
		System.out.println("Company is located in: "+city+" and the no.of employees is: "+totalemp);
	}
}
//child class
class MainBranch extends HeadQuarters
{
	protected int totalempMB;
	protected String citynameMB;
	//method overriding
	public void getDetails()
	{
		System.out.println("HeadQuarters");
		super.getDetails();
		System.out.println("Main Branch");
		System.out.println("Enter the city where Main Branch is situated: ");
		s.nextLine();//to give the input in a new line
		citynameMB=s.nextLine();//to give the input in a new line
		System.out.println("Enetr the total no.of employees in the city main branch");
		totalempMB=s.nextInt();
	}
	//method overriding
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Main Branch");
		System.out.println("Company is located in: "+citynameMB+" and the no.of employees is: "+totalempMB);
	}
}
public class DemoOnMethodOverriding {

	public static void main(String[] args)
	{
		MainBranch m=new MainBranch();
		m.getDetails();
		m.showDetails();
	}

}
