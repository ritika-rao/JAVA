import java.util.Scanner;
 class series{

	public static void main(String args[])
	{
		int x,i,j,k,n;
		float num,dom,term,series=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		x= scan.nextInt();
		System.out.print("Enter thr number of terms: ");
		n=scan.nextInt();
		for(i=0;i<n;i++){
			num=1;
			for(j=0;j<i;j++)
				num=num+x;
			dom=1;
			for(k=0;k<i;k++)
				dom=dom*j;
			term=num/dom;
		System.out.print(series=series+term);
		}
	}
}
