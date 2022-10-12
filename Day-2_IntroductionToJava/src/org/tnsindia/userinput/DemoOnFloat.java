package org.tnsindia.userinput;
////Program on user-input for Float data-type
import java.util.Scanner;

public class DemoOnFloat {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		float x = s.nextFloat();
		System.out.println("The result is: ");
		System.out.println(x);

	}

}
