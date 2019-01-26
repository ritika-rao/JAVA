class pro4
{
	public static void main (String args [])
	{
	
	Double v = 43200.00;
	Double a,b,c;
	System.out.println("The entered time (in minutes) is  :" + v );
	a=0.000694*v;
	System.out.println("The value of time in terms of DAYS is :" + a );
	b=0.0000231*v;
	System.out.println("The value of time in terms of MONTHS is :" + b );
	c=0.00000063419584*v;
	System.out.println("The value of time in terms of YEARS is :" + c );
	}
}