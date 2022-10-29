package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class MappingDemo {

	public static void main(String[] args) 
	{
		List<String> obj = Arrays.asList(new String[] {"Yogesh","XYZ","Sonu"});
		obj.stream().map(i->i.length()).forEach((i)->System.out.println(i+" "));
	}

}
