import java.util.Scanner;

class add
{
 int first;
 int second;
  add(int x,int y){
  first=x;
  second=y;
  }
  add(){
 	first=0;
 	second=0;

 }
	int sum_fn()
	{
	 return first+second ;
	}
 

}

class myAddMain
{
public static void main(String [] args){
	Scanner in=new Scanner(System.in);
	int x,y;
	System.out.print("Enter first no.:");
    x=in.nextInt();
    System.out.print("Enter second no.: ");
    y=in.nextInt();
    add a1=new add(x,y);
    a1.sum_fn();
    System.out.println("sum is:" +a1.sum_fn());
    add a2=new add();
    a2.sum_fn();
     System.out.println("sum is:" +a2.sum_fn());

}	
}
