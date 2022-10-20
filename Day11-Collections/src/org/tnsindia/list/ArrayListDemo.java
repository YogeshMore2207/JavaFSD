package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Example on List Interface using ArrayList
public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("Yogesh");
		list.add("Subhash");
		list.add("More");
		//Enhanced for loop is used to extract the elements of your ArrayList
		/*for(String str:list)
		  {
		  		System.out.println(str);
		  }*/
		
		List<String> list1 = new LinkedList<String>();
		list1.add("Rutvik");
		list1.add("Yuvraj");
		list1.add("Sakpal");
		
		//Using Iterator we can extract the element of a list
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("The elements in the List1 are: "+list);
		System.out.println("The elements in the List2 are: "+list1);
		//Contains()method is used to check whether list contains that element or not
		System.out.println(list.contains("More"));
		//Size is used to print the length
		System.out.println(list.size());
		//Remove is used to remove the specified index value
		System.out.println(list.remove(1));
		System.out.println("The elements in the List1 are: "+list);
		//Adding the list2 elements to list1
		list.addAll(list1);
		System.out.println("The elements in the List1 are: "+list);
		list.removeAll(list);
		System.out.println("The elements in the List1 are: "+list);
		Collections.sort(list1);
		System.out.println("The elements in the List2 are: "+list1);
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("The elements in the List2 are: "+list1);
	}

}
