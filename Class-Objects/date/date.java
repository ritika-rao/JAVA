import java.util.*;
class date
{
	int month,day,year;
	//user input 
	date(int m,int d,int y)
	{
		this.month=m;
		this.day=d;
		this.year=y;
	}
	//default date
	date()
	{	
		this.month=1;
		this.day=1;
		this.year=2000;
	}
	void display()
	{
		System.out.println(day+"/ "+month+"/ "+year);

	}

}
class dateTest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the month: ");
		int month=in.nextInt();
		System.out.println("Enter the day: ");
		int day=in.nextInt();
		System.out.println("Enter the year: ");
		int year=in.nextInt();
		//if we have to check valid input 
		/*if(month>12)
		{
			return;
		}
		else if(year%4==0)
		{
			return;
		}
		else if(month==1||month==3||month==5||month==7||month==12||month==8||month==10)
		{
			if(day==31)
			{
				return;
			}
			else if(day!=31)
			{
				System.out.println("False Input");
			}
		}
		else if(month==4||month==6||month==9||month==11)
		{
			if(day==30)
			{
				return;
			}
			else if(day!=31)
			{
				System.out.println("False Input");
			}
		}
		else if(month==2)
		{
			if(year%4==0)
			{
				if (day==29)
				{
					return;
				}
				else if(day!=29)
				{
					System.out.println("False Input");
				}
			}
			else if(year%4 !=0)
			{
				if(day==28)
				{
					return;
				}
				else if(day!=28)
				{
					System.out.println("False Input");
				}
			}
		}*/
			date d1=new date(month,day,year);
			date d2=new date();
			System.out.println("The date formatt is:  ");
			d2.display();//default date
			System.out.println("Today'sdate is  ");
			d1.display();//user entered 
		
	}
	
}