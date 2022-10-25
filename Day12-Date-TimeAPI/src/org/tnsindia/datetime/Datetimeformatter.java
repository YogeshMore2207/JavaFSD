package org.tnsindia.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimeformatter {

	public static void main(String[] args) 
	{
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("dd-MM-yyyy \n hh:mm");
		String s = dt.format(tf);
		System.out.print(s);
	}

}
