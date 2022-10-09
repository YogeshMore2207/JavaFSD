package org.tnsindia.stringtokenizer;

import java.util.StringTokenizer;

public class Example2 {

	public static void main(String[] args)
	{
		StringTokenizer s=new StringTokenizer("Lets try this");
		while(s.hasMoreTokens())
		{
		System.out.println(s.nextToken());
		}
	}

}
