package org.tnsindia.stringtokenizer;

import java.util.StringTokenizer;

public class Example1 {

	public static void main(String[] args) 
	{
		StringTokenizer s=new StringTokenizer("Lets try this");
		System.out.println(s.nextToken());
		System.out.println(s.nextToken());
	
	}

}
