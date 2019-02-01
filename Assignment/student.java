

class Student 
{
	String firstName;
	String lastName;
	Address addr;
	Date dob; 		//date of birth 
	String[] skills;
	Qualification[] qual;
	Project[] projects;
	String eMail;
	String contactNo ;
	int skillnum,qualnum,projectnum;
	Student()
	{
		firstName=null;
		lastName=null;
		addr=new Address();
		dob=new Date();
		skills=null;
		skillnum=0;
		qualnum=0;
		projectnum=0;
		qual=new Qualification[0];
		projects =new Project[0];
		eMail=null;
		contactNo=null;
	}
	Student(String a,String b,Address c,Date d,String[] e,int elen,Qualification[] f,int flen ,Project [] g,int glen,String h,String i )
	{
		int k;
		firstName=a;
		lastName=b;
		addr=c;
		dob=d;
		skillnum=elen;
		qualnum=flen;
		projectnum=glen;
		String[] skills =new String[skillnum];
		Qualification[] qual=new Qualfication[qualnum];
		Project[] projects=new Project[projectnum];
		for(k=0;k<skillnum;k++)
		{
			skills[k]=e[k];
		}
		for(k=0;k<qualnum;k++)
		{
			qual[k]=f[k];
		}
		for(k=0;k<projectnum;k++)
		{
			project[k]=g[k];
		}

		eMail=h;
		contactNo=i;
	}
	Student(String a,String b,Address c,Date d, String[] e,int elen,Quaification []f , int flen,String i, String j)
	{
		int k;
		firstName=a;
		lastName=b;
		addr=c;
		dob=d;
		skillnum=elen;
		qualnum=flen;
		String [] skills =new String[elen];
		Qualification[] qual=new Qualification[flen];
		for(k=0;k<skillnum;k++)
		{
			skills[k]=e[k];
		}
		for(k=0;k<qualnum;k++)
		{
			qual[k]=f[k];
		}
		eMail=i;
		contactNo=j;
	}
	void display()
	{
		System.out.println("Firstname: "+firstName);
		System.out.println("last name:"+lastName);
		System.out.println("Address: ");
		addr.display();
		System.out.println("Date of Birth: ");
		dob.display();
		Sytem.out.println("Skills: ");
		if(skillnum>0)
		{
			for(int i=0;i<skillnum;i++)
			{
				System.out.println((i+1)+"   ");
			}
		}
		if (qualnum>0)
		{
			for(int i=0;i<qualnum;i++)
			{
				System.out.println((i+1)+" ");
				qual[i].display();
			}
		}
		if(projectnum>0)
		{
			for(int i=0;i<projectnum;i++)
			{
				System.out.println((i+1)+" ");
				projects[i].display();
			}
		}
		System.out.println("Email ID : "+eMail);
		System.out.println("Contact No. : "+contactNo);
	}
}

