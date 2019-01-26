import java.util.Scanner;
class doubleodd
 {
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
int arr[][]= new int[10][10];
int i,j,row,col;;
System.out.println("Enter row of array: ");
row=scan.nextInt();
System.out.println("Enter the column of array:");
col=scan.nextInt();
System.out.println("Enter elements of array: ");
for(i=0;i<row;i++)
    {
	for(j=0;j<col;j++)
		{
		   arr[i][j]=scan.nextInt();
	        }
    }
System.out.println("The Modified array is:");
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
		if(arr[i][j]%2==0)
	        System.out.print(" ");
		else
		System.out.print((arr[i][j]*2)+" ");
	}
    System.out.println();
}  

}
}