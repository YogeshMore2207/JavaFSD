package org.tnsindia.interfaceexample;

import java.util.Scanner;

//Marker Interface
/*A marker interface called ThreadSafe can communicate to other developers
 *that classes implementing this marker interface give a thread-safe guarantee,
 *and any modification should not violate that.  
 */

interface Cloneable
{
	/*It is an empty interface (no fields or methods). Example of marker interface are
	 * Serializable,
	 * Cloneable and Remote Interface.
	 * All these interfaces are empty interfaces.
	 NOTE:- If we not use clonaeble as interface still its run because Cloneable is marker interface in java*/
}
class Product implements Cloneable
{
	public int pid;
	public String pname;
	public double pcost;
	//Product class constructor
	public Product(int pid, String pname, double pcost)
	{
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
		
	}
	//method that prints the detail on the console
	public void showDetail()
	{
		System.out.println("Product ID: "+pid);
		System.out.println("Product Name: "+pname);
		System.out.println("Product Cost: "+pcost);
	}
}
public class MarkerInterfaceDemo {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Product ID: ");
		int pid = s.nextInt();
		System.out.println("Enter Product Name: ");
		String pname = s.next();
		System.out.println("Enter Product Cost: ");
		double pcost = s.nextDouble();
		System.out.println("-------Product Details-------");
		Product p1 = new Product(pid, pname, pcost);
		//Cloning the object of the product clss using the clone() method
		p1.showDetail();	
		s.close();
	}

}
