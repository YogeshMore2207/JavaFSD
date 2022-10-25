package org.tnsindia.datetime;

//Example of LocalDateTime class
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Localdatetime {

	public static void main(String[] args) 
	{
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		LocalDate d1 = LocalDate.of(2021, 2, 28);
		System.out.println(d);		
		System.out.println(t);	
		System.out.println(dt);	
		//We can check the date is valid or not using .of method
		System.out.println(d1);	
	}

}
