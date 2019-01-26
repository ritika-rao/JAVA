import java.util.*;
class vehicle
{
	void display()
	{
	System.out.println("This is a vehicle");
	}
}
class car extends vehicle
{
	void display()
	{
	System.out.println("This is a car ");
	}
}
class bike extends vehicle
{
	void display()
	{
	System.out.println("This is a bike");
	}
}
class main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.of tyres:");
		int n=in.nextInt();
		switch(n)
		{
			case 2:
			{
			bike b1=new bike();
			b1.display();
			break;
			}
			case 4:
			{
			car c1=new car();
			c1.display();
			break;
			}
			default:
			System.out.println("Invalid Input");
		}	
	}
}
