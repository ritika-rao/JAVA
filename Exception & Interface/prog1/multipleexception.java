import java.util.*;
class multipleexception
{
	public static void main(String args[])
	{
	try
	{
	int a[]=new int[5];
	a[4]=30/2;
	Scanner in=new Scanner(System.in);
	System.out.println("enter no.");
	int b=in.nextInt();
	}
	catch(ArithmeticException e)
	{
	System.out.println("task 1 Done");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("task 2 Done");
	}
	catch(NumberFormatException e)
	{
	System.out.println("task 3 Done");
	}
	catch(NullPointerException e)
	{
		System.out.println("task 4 Done");
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("task 5 Done");
	}
	System.out.println("Rest of the Code");
	}
}
