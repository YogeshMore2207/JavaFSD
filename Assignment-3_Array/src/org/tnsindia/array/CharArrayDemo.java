package org.tnsindia.array;

public class CharArrayDemo {

	public static void main(String[] args) 
	{
		char arr[] = {'1', 'A', 'a', '!', ' '};
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			{
				System.out.println(arr[i]+" is a Digit");
			}
			if(Character.isLetter(arr[i]))
			{
				System.out.println(arr[i]+" is a Character");
			}
			if(Character.isWhitespace(arr[i]))
			{
				System.out.println(arr[i]+" is a White space");
			}
			if(Character.isUpperCase(arr[i]))
			{
				System.out.println(arr[i]+" is a Upper case");
			}
			if(Character.isLowerCase(arr[i]))
			{
				System.out.println(arr[i]+" is a Lower case");
			}
		}
	}

}
