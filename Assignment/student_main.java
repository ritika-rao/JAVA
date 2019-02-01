import java.util.*;
class student_main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner isc=new Scanner(System.in);

		//name input
		System.out.println("Enter First Name : ");
		String fname=sc.nextLine();
		System.out.println("Enter Last Name : ");
		String lname=sc.nextLine();

		//address input
		System.out.println("Enter Address (line 1) : ");
		String adline1=sc.nextLine();
		System.out.println("Enter (Line 2 ) : ");
		String adline2=sc.nextLine();
		System.out.println("Enter City : ");
		String city=sc.nextLine();
		System.out.println("Enter State : ");
		String state=sc.nextLine();
		System.out.println("Enter Pin Code : ");
		int pin=isc.nextInt();
		Address ad=new Address(adline1,adline2,city,state,pin);

		//Date of Birth input
		System.out.println("Enter the date of birth(dd/mm/yy) :  ");
		int date=isc.nextInt();
		int month=isc.nextInt();
		int year=isc.nextInt();
		Date dob=new Date(date,month,year);

		//skills input
		int l=0;int snum;
		System.out.println("How many skills do you want to enter?? "); //no.of skills
		do
		{   if(l>0)
			{
				System.out.println("Atleast one skill is req. ");
				snum=isc.nextInt();
				l++;
			}
		} 
		while(snum<1);
		l=0;
		String[] skill=new String[snum]; 		//skills in array
		for(int i=0;i<snum;i++)
		{
			System.out.println("Enter skill "+(i+1)+": ");
			skill[i]=sc.nextLine();
		}

		//Qualification input
		int qnum;String qname,univ,inst;float cgpa;
		System.out.println("How many qualifications do you want to enter?? "); //no.of degress
		do
		{   if(l>0)
			{
				System.out.println("Atleast one qualification is req. ");
				qnum=isc.nextInt();
				l++;
			}
		} 
		while(qnum<1);
		l=0;
		Qualification[] qual=new Qualification[snum]; 		//qualification in array
		for(int i=0;i<qnum;i++)
		{
			System.out.println("Enter Qualification "+(i+1)+": ");
			System.out.println("Name:");
			qname[i]=sc.nextLine();
			System.out.println("University:");
			univ[i]=sc.nextLine();
			System.out.println("Institute:");
			inst[i]=sc.nextLine();
			System.out.println("CGPA obtained: ");
			cgpa=nextFloat();
			qual[i]=new Qualification(qname,univ,inst,cgpa);
		}

		//projects done
		String pname,role;int sd,sm,sy,ed,em,ey,resno,pnum;
		System.out.println("How many projects do you want to enter ?");
		pnum=isc.nextInt();
		Project[] pro=new Project[pnum];
		if(pnum>0)
		{
			for(int i=0;i<pnum;i++)
			{
				System.out.println("Enter Project no. "+(i+1)+ " name");
				pname=sc.nextLine();
				System.out.println("Enter Project no. "+(i+1)+ " start date");
				sd=isc.nextInt();
				sm=isc.nextInt();
				sy=isc.nextInt();
				Date start=new Date(sd,sm,sy);
				System.out.println("Enter Project no. "+(i+1)+ " end date");
				ed=isc.nextInt();
				em=isc.nextInt();
				ey=isc.nextInt();
				Date end=new Date(ed,em,ey);
				System.out.println("Enter your role in project no. "+(i+1));
				role=sc.nextLine();
				System.out.println("How many responsibilities did you have in project no. "+(i+1));
				do{
					if(l>0)
					System.out.println("Atleast 1 responsibility is required");
					resno=isc.nextInt();
					l++;
				}
				while(resno<1);
				String[] res= new String[resno];
				for(int k=0;k<resno;k++)
				{
					System.out.println("Enter responsibility no. "+(i+1));
					res[k]=sc.nextLine();
				}
				pro[i]=new Project(pname,start,end,role,resno,res);
			}
		}
		System.out.println("Enter your Email ID: ");
		String email=sc.nextLine();
		System.out.println("Enter your contact no. ");
		String cont= sc.nextLine();
		Student s1;
		if(pnum>0)
		{
			System.out.println(snum);
			s1=new Student(fname,lname,ad,dob,skill,snum,qual,pro,pnum,email,cont);
		}
		else
		{
			System.out.print(snum);
			s1=new Student(fname,lname,ad,dob,skill,snum,qual,qnum,email,cont);
		}
		s1.display();

	}
}