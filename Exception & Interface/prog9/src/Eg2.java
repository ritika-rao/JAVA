import java.util.*;
class Eg2
{
	public static void main(String[] args)
	{
		char ch;
		Scanner in=new Scanner(System.in);
		do{
	System.out.println("Enter first no.");	
	int a=in.nextInt();
	System.out.println("Enter second no.");
	try
	  {
		int b=in.nextInt();
	    System.out.println(a/b);
	  }
	  catch(InputMismatchException e)
	  {
	  	System.out.println(e);
	  }
	  catch(Exception e)
	  {
        System.out.println(e);
	  }
	  System.out.println("to continue press y");
	  ch=in.next().charAt(0);
	}
	while(ch=='y');
	}
}
