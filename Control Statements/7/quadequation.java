import java.util.Scanner;
class Quadequation
{
	public static void main( String [] args)
{
	int a,b,c;
	double r1,r2,D;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value of 'a' :");
	a=in.nextInt();
	System.out.println("Enter the value of 'b' :");
	b=in.nextInt();
	System.out.println("Enter the value of 'a' :");
	c=in.nextInt();
	System.out.println("Quadratic Equation : "+a+"x^2+"+b+"x+"+c);
    D=(b*b)- (4*a*c);
    if(D>0)
    {
    System.out.println("UNEQUAL and REAL roots");
    r1=(b + Math.sqrt(D))/(2*a);
    r2=(-b + Math.sqrt(D))/(2*a);
    System.out.println("1st ROOT : "+r1+"2nd ROOT : "+r2);
    }
    else if(D==0)
    {
    System.out.println("EQUAL and REAL roots");
    r1=(-b + Math.sqrt(D))/(2*a);
    System.out.println("1st ROOT = 2nd ROOT : "+r1);
    }
    else 
    {
    System.out.println("IMAGINARY roots as 'D<0' ");
    }
}
}