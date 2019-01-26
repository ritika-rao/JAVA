import java.util.Scanner;
class character{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the chracter:");
	char ch = in.next().charAt(0);
	if((ch>='A'&&ch<='Z')||(ch>='a'&& ch<='z')){
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	System.out.println("it is a vowel");
	else
	System.out.println("consonent");
	}
    else
    System.out.println("ERROR!!"); 
	}
}