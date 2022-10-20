package org.tnsindia.comparatordemo;

public class ComparatorDemo {

	public static void main(String[] args)
	{
		Employee emp[] = new Employee[2];
		
		//for emp1
		
		emp[0] = new Employee();
		emp[0].setAge(22);
		emp[0].setName("Abhay");
		
		//for emp2
		
		emp[1] = new Employee();
		emp[1].setAge(21);
		emp[1].setName("Yogesh");
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee "+(i+1)+" Name: "+emp[i].getName()+" Age: "+emp[i].getAge());
			
		}
	}

}
