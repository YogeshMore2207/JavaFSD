package org.tnsindia.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		Map<Integer,String> obj = new HashMap<>();
		
		//1.Key can't be duplicated but value can be duplicated
		//2.It follows the sorting order
		obj.put(1,"Yogesh");
		obj.put(2,"Abhay");
		obj.put(3,"Om");
		obj.put(2,"Amey");
		obj.put(null, null);
		obj.put(5, null);
		System.out.println(obj);
		//To extract the pairs from map
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
