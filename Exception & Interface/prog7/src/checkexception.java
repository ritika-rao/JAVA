import java.util.*;
class myException extends Exception
{
	myException(String S)
	{
	super(S);
	}
}
class checkException
{
	public static void main(String[] args)
	{
	 try
	 {
       throw new myException("my own exception");
	 }
	 catch(myException e)
	 {
	 System.out.println(e);
	 }
	}
}