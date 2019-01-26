import java.util.Scanner;
class letter
{
	public static void main( String [] args)
	{
	int n,l1,l2,l3,l4,l5;
	Scanner in=new Scanner(System.in);
	System .out.println("enter any number :");
	n=in.nextInt();
	l1=n%10;
	n=n/10;
	l2=n%10;
	n=n/10;
	l3=n%10;
	n=n/10;
	l4=n%10;
	n=n/10;
	l5=n%10;
	System .out.println(""+l5+"   "+l4+"   "+l3+"   "+l2+"   "+l1);
    }
}
