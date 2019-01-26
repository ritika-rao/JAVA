import java.util.Scanner;
class Month
{
	public static void main( String [] args)
	{
	int x;
        int k;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any value : ");
	x=scan.nextInt();
        do
     {	
        switch(x)
	{
	case 1: System.out.println("JANUARY");
	break;
	case 2:System.out.println("FEBRUARY");
	break;
	case 3:System.out.println("MARCH");
	break;
	case 4:System.out.println("APRIL");
	break;
	case 5:System.out.println("MAY");
	break;
	case 6:System.out.println("JUNE");
	break;
	case 7:System.out.println("JULY");
	break;
	case 8:System.out.println("AUGUST");
	break;
	case 9:System.out.println("SEPTEMBER");
	break;
	case 10:System.out.println("OCTOBER");
	break;
	case 11:System.out.println("NOVEMBER");
	break;
	case 12:System.out.println("DECEMBER");
	break;
	default:
	System.out.println("Oops! Invalid Input");
	}
	System.out.println("If want to continue press 1 ");
	k=scan.nextInt();
    }
		while(k==1);
}
}