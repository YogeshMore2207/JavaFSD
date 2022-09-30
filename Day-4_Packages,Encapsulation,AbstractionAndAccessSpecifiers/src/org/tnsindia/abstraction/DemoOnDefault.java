package org.tnsindia.abstraction;
//Demo on default access specifier
class c
{
	//Default Variable
	String VehicleType;
}
public class DemoOnDefault {

	public static void main(String[] args) {
		
		c c1 = new c();
		/*If any data members is default then it can access only inside the same package,
		 * it can not be access outside the another package
		 */
		c1.VehicleType="Train";
		System.out.println("Vehicle type is: "+c1.VehicleType);
	}

}
