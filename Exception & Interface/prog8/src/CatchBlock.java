import java.util.*;
class CatchBlock
{
	public static void main(String[] args)
	{
	try
	{
      int a[]=new int[5];
      a[2]=30/6;
      System.out.println("enter the value of b");
      Scanner in=new Scanner(System.in);
      int b=in.nextInt();
	}
	catch(ArithmeticException e)
	{
	 System.out.println("task1 is completed");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("task2 is completed");
	}
	catch(Exception e)
	{
	System.out.println("common task completed");
	}
	System.out.println("rest of the code...");
	}
}