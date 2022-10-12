package org.tnsindia.userinput;
//Program on user-input for String data-type
import java.util.Scanner;

public class DemoOnString {

	public static void main(String[] args) {
		//for user-input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		char x = s.next().charAt(2);
		System.out.println("The result is: ");
		System.out.println(x);
		s.close();

	}

}
