class A 
{
	int num;
	void set()
	{
		num=100;
	}
	void get()
	{
		System.out.println(num);
	}
	void myfunc()
	{
		System.out.println("A");
	}
}
class B extends A
{
	int data;
	void fun1()
	{
		data=500;
	}
	void display()
	{
		System.out.println(num +" "+ data);
	}
	void myfunc()
	{
		System.out.println("B");
	}
}
class X extends B
{	
	void myfunc()
	{
		System.out.println("X");
	}
}
class C
{
	public static void main(String[] args)
	{
		/* Bb1=new B(); 		//already executed
		b1.fun1();
		b1.set();
		b1.display();*/
		/*A a1=new B();
		a1.set();
		a1.get();
		//a1.fun1();		//Error in Display 
		//a1.display();		//can not find reference 
		//B b =new A(); 	//typecast req.
		A b ;
		B a=new B();
		b=(A)a;
		b.set();
		b.get();*/
		A a=new A();
		B b=new B();
		X x=new X();
		A ob;
		ob=a;
		ob.myfunc();
		ob=b;
		ob.myfunc();
		ob=x;
		ob.myfunc();
	}
}
