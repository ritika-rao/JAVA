import java.util.Scanner;
class duplicate{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		int x=0;int count=0; int num=0;
		while(x<5){
		System.out.println("Enter the number: ");
		num=scan.nextInt();
		if ((num>=10) && (num<=100)){
			boolean digit=false;
			x++;
			for (int i=0;i<5;i++){
				if(arr[i]==num)
					digit=true;
			}
			if(!digit){
				arr[count]=num;
				count++;
			}
			else {
				System.out.println("The number was entered before\n");
				x=x-1;
			    continue;
	        }
        }
		else 
           System.out.println("The number must be between 10 and 100 ");
        for (int i=0;i<count;i++)
      	    System.out.print(arr[i]+" ");
      	{ 
            System.out.println();
	  }}
	}
}