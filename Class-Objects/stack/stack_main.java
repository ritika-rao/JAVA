import java.util.*;
class stack_main
{
public static void main(String[] args)
 {
 Scanner scan=new Scanner(System.in);
 int z;
 stack s1=new stack();
 do { 
 	System.out.println("Choose from the following:\n1.PUSH\t2.POP\t3.IS EMPTY\n4.SPACE LEFT\t5.IS FULL\t6.DISPLAY\n7.EXIT\n");
 	int ch=scan.nextInt();
 switch(ch){
 	case 1:
 	{ 
 		System.out.println("Enter the number: ");
 		int a=scan.nextInt();
        s1.push(a);
 	 	break;
    }
 	case 2:
 	{
 		s1.pop();
 		break;
 	}
 	case 3:
 	{
 		boolean b=s1.isEmpty();
 		System.out.println(b);
 		break;
 	}
 	case 4: 
 	{
 		boolean b=s1.spaceLeft();
 		System.out.println(b);
 		break;

 	}
 	case 5:
 	{
 		System.out.println(s1.isFull());

 		break;
 	}
 	case 6:
 	{
 		s1.display();
 		break;
 	}
 	default:
 		System.out.println("INVALID INPUT");
    }
    System.out.println("If you want to continue press 0");
   	z=scan.nextInt();
   }
    while(z==0);

 }
}