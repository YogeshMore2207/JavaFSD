package org.tnsindia.userinput;
//Program on user-input for char data-type
import java.util.Scanner;

public class DemoOnChar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		//The Difference between next() and nextLine()
		/*next() will take only the first word of your sentence and
		nextLine() will take the complete sentence*/
		String x = s.nextLine();
		System.out.println("The result is: ");
		System.out.println(x);
	}

}
