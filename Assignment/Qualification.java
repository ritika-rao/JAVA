class Qualification
{
	String qualName;
	String university;
	String institute;
	float cgpa;
	Qualification(String qn,String uni,String ins,float a);
	{
		qualName=qn;
		university=uni;
		institute=ins;
		cgpa=a;
	}
	Qualification()
	{
		qualName=null;
		university=null;
		institute=null;
		cgpa=0;
	}
	void display()
	{
		System.out.println(qualName+"\n"+university+"\n"+institute+"\n CGPA: "+cgpa);
	}
}