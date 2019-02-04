import java.util.*;
class abc
{
  int n1,n2;
  abc()
  {
  n1=0;n2=0;
  }
  abc(int a,int b)
  {
  n1=a;
  n2=b;
  }
  public int add()
  {
  	return(n1+n2);
  }
}
class prog3
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	 try
	 {
	 System.out.println("enter no.");
	 int x=in.nextInt();
	 int y=in.nextInt();
	 abc ob=new abc(x,y);
	 ob=null;
	 System.out.println(ob.add());
	 }
	 catch(NullPointerException e)
	 {
       System.out.println("Task completed");
	 }
	}
}

