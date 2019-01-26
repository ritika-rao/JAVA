import java.util.Scanner;
class precison
{
  public static void main( String [] args)
  {
	double a,b,x,y;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value of x :");
	a=scan.nextDouble();
	System.out.println("Enter the value of y :");
	b=scan.nextDouble();
	x=0.3d*a;
	y=0.3d*b;
	if (a==b)
	System .out.println("EQUAL");
	else
	System .out.println("UNEQUAL");
  }
}