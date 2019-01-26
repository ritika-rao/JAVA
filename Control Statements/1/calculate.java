import java.util.Scanner;

public class calculate{

	public static void main(String args [] ) 
	{
	Scanner number =new Scanner(System.in);
	System.out.println("Enter the two numbers:");
	int num1=number.nextInt();
	int num2=number.nextInt();
	int add=num1+num2;
	int sub=num1-num2;
	int mul=num1*num2;
	int div=num1/num2;
	System.out.println("addition is = " +add);
	System.out.println("subtraction is= " +sub);
	System.out.println("multiply is = " +mul);
	System.out.println("divide is " +div);
	}
}