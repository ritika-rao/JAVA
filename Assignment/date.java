import java.util.*;
class Date
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
