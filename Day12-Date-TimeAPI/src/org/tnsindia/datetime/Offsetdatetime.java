package org.tnsindia.datetime;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Offsetdatetime {

	public static void main(String[] args) 
	{
		OffsetDateTime o = OffsetDateTime.now();
		OffsetTime d = OffsetTime.now();
		System.out.println(o);	
		System.out.println(d);	
	}

}
