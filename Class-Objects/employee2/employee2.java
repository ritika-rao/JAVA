import java.util.*;
class employee
{
	String name;
	String ad;
	int year;
	employee(String a,String b,int c)
	{
		name=a;
		ad=b;
		year=c;
	}
	employee()
	{
		name=null;
		ad=null;
		year=2019;
	}
	void display()
	{
		System.out.println(name+"\t"+year+"\t\t"+ad);
	}
}

class employee_main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int y,e,i;
		String n;
		String a;
		System.out.println("how many employees ?");
		e=in.nextInt();
		employee tub[]=new employee[e];
		for (i=0;i<e;i++)
		{
			System.out.println("Employee Number "+i);
			System.out.println("Enter name : ");
			n=in.nextLine();
			n=in.nextLine();
			System.out.println("Enter address: ");
			a=in.nextLine();
			System.out.println("Enter year of joining ");
			y=in.nextInt();
			tub[i]=new employee(n,a,y);
		}
		System.out.println("Name\tYear of joining\t\tAddress");
		for(i=0;i<e;i++)
		{
			tub[i].display();
		}
	}
}