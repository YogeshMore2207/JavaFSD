import java.util.Scanner;

// Demo on default and parameterized constructor

class Bus
{
	public int speed;
	//Parameterized Constructor
	Bus(int s1)
	{
		speed = s1;
		System.out.println("The speed is:"+s1+"km/hr");
	}
	//Default Constructor
	public Bus()
	{
		System.out.println("Default Constructor");
	}
}
public class Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of speed: ");
		int s1 = s.nextInt();
		Bus b = new Bus();
		Bus b1 = new Bus(s1);
		s.close();

	}

}
