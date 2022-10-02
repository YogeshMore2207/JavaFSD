package org.tnsindia.encapsulation;
//Program On Encapsulation
public class HDFC {
	
	//Achieving Using private data members
	private int pin_no;

	/*if any variable is decleared as a private and if u want to 
	 * access it into another class then use getters and setters method
	 */
	public int getPin_no()
	{
		return pin_no;
	}
	public void setPin_no(int pin_no)
	{
		this.pin_no = pin_no;
	}
}