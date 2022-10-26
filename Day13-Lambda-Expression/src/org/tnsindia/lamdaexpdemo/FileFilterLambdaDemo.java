package org.tnsindia.lamdaexpdemo;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambdaDemo {

	public static void main(String[] args)
	{
		//Lambda Expression to search a file in given location
		FileFilter f = (File pathname)->pathname.getName().endsWith(".txt");
		File dir = new File("D:\\Downloads");
		File contents[] = dir.listFiles(f);
		for(File fi:contents)
		{
			System.out.println(fi);
		}
	}

}
