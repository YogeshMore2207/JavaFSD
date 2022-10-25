package org.tnsindia.datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class ZonelDclass {

	public static void main(String[] args) 
	{
		//Enhance for loop using for getting available zones
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
		LocalTime t = LocalTime.now(ZoneId.of("Egypt"));
		//It will show the zone id time
		System.out.println(t);

	}

}
