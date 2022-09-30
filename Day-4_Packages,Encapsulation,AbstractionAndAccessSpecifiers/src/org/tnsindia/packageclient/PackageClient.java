package org.tnsindia.packageclient;

import java.util.Scanner;

import org.tnsindia.packagedemo.PackageDemo;

public class PackageClient {

	public static void main(String[] args) {
		/*for accessing the method of PackageDemo class
		  import the package of specified class*/
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1=s.nextLine();
		
		PackageDemo d=new PackageDemo();
		d.str=s1;
		d.Display();
		s.close();

	}

}
