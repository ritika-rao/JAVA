import java.util.Scanner;
class employee
{
	String firstname;
	String lastname;
	double salary;
	employee(String fn,String ln,double d)
	{
	firstname=fn;
	lastname=ln;
	salary=d;
	}
	double yr_sal()
	{
	return salary*12;
	}
	void salRaise(){
	salary=salary*0.1;
	}
	void displayEmp()
	{
		System.out.println("First name:"+firstname);
		System.out.println("Last name:"+lastname);
		System.out.println("Salary:"+salary);
	}
}
class emp_main
{
    public static void main(String[] args)
    { 
    Scanner in=new Scanner(System.in);
    String f,l;
    double s;
    System.out.print("Enter first name:");
    f=in.next();
    System.out.print("Enter last name: ");
    l=in.next();
    System.out.print("Enter salary: ");
    do {  
    	s=in.nextDouble();
    	if(s<0)
    	 {
    	 	System.out.println("salary is positive quantity,please enter again ");
    	 }
        }
    	 while(s<0);
	employee e1=new employee(f ,l ,s);
    e1.displayEmp();

    }
}
