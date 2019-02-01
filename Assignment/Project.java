class Project
{
	String name;
	Date startDate;
	Date endDate;
	String role;
	int res;
	String[] respon;
	Project(String n,Date sd,Date ed,String ro,int re,String[] rep)
	{
		name=n;
		startDate=sd;
		endDate=ed;
		role=ro;
		res=re;
		respon=new String[res];
		for(int i=0;i<res;i++)
		{
			respon[i]=rep[i];
		}
	}
	Project(String a,Date b,Date c,String d)
	{
		name=a;
		startDate=b;
		endDate=c;
		role=d;
	}
	Project()
	{
		name=null;
		startDate=new Date();
		endDate=new Date();
		role=null;
		respon=null;
		res=0;
	}
	void display()
	{
		System.out.println(name);
		startDate.display();
		endDate.display();
		System.out.println("\nRole: "+role);
		if(res>=1)
		{
			System.out.println("Respon:  ");
			for(int i=0;i<res;i++)
			{
				System.out.println((i+1)+"  "+respon[i]);
			}
		}
	}
}