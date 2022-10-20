package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnCollectionInterface {

	public static void main(String[] args) 
	{
		Collection obj = new ArrayList<>();
		//adding the values
		obj.add("Yogesh");
		obj.add('X');
		obj.add(80.55f);
		System.out.println("The element the collection are: "+obj);
	}

}
