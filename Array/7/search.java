import java.util.Scanner;
class search{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements :");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elemnts: ");
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("enter number to be searched: ");
		int x= scan.nextInt();
		int flag=0;
		for(int i=0;i<n;i++){
			if (arr[i]==x){
				System.out.println(i);
				flag=0;
				break;
			}
			else
			flag=1;
		}
		if (flag==1)
			System.out.println("oops!!element entered is not in our array");

		System.out.println("Our array is: ");
		for(int i: arr){
			System.out.print("  "+ i + "  ");
		}

	}
}