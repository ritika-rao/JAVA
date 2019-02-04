import java.util.*;
class exception
{
	String s;
	exception()
	{
	s=" ";
	}
	exception(String S)
	{
	s=S;
	}
	char string()
	{
	return((char)s.charAt(100));
	}
}
class prog2
{
	public static void main(String args[])
	{
      Scanner in=new Scanner(System.in);
      try
      {
       System.out.println("enter string");
       String s1=in.nextLine();
       exception ob=new exception(s1);
       System.out.println(ob.string());
      }
      catch(Exception e)
      {
      System.out.println("task completed");
      }
	}
}