class Address
{
	String line1;
	String line2;
	String city;
	String state;
	int pincode;
	Address(String l1,String l2,String c,String s,int p)
	{
		line1=l1;
		line2=l2;
		city=c;
		state=s;
		pincode=p;
	}
	Address()
	{
		line1=null;
		lne2=null;
		city=null;
		state=null;
		pincode=0;
	}
	void display()
	{
		System.out.println(line1+"\n"+line2+"\n"+city+"\n"+state+"\n Pincode+pincode");
	}
}