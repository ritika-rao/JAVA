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
	void myfun()
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
	System.out.println(num+" "+data);
	}
	void myfun()
	{
		System.out.println("B");
	}
}
class X extends B
{
	void myfun()
	{
		System.out.println("X");
	}
}
class C
{
	public static void main(String[] args)
	{
	/*B b=new B();
	b.set();      
	b.fun1();
	b.display();*/
	   /* A a=new B();
		a.set();       //run
		a.get();       //run
		//a.fun1();    //error can't find reference
		//a.display();  */
		/*B b=new A();
		b.set();
		b.get();
		b.fun1();
		b.display();*/
		/*B b;
		A a=new A();
		b=(B)a;*/
		/*A a;
		B b=new B();
		a=(A)b;
		a.set();
		a.get();
		a.data=100;*/
		A a=new A();
		B b=new B();
		X x=new X();
		A ob
		;
		ob=a;
		ob.myfun();
		ob=b;
		ob.myfun();
		ob=x;
		ob.myfun();
	}
}
