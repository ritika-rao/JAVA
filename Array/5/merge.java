import java.util.Scanner;

class merge{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
        int arr1[]= new int[5];
        int arr2[]= new int[5];
        int merge[]=new int[10];
        int k=0,j=0,i=0,x;
        System.out.print("\nEnter elemnts of array1: ");
        for(x=0;x<5;x++)
		    arr1[x]=scan.nextInt();
		System.out.print("\nEnter elemnts of array2: ");
        for(x=0;x<5;x++)
		    arr2[x]=scan.nextInt();
		System.out.println("\nElements of array1 are : ");
		for(x=0;x<5;x++)
		    System.out.print(arr1[x]+" ");
		System.out.println("\nElements of array2 are: ");
	    for(x=0;x<5;x++)
	        System.out.print(arr2[x]+" ");
	    while(i<5 && j<5){
		    if(arr1[i]<arr2[j])
			    merge[k++]=arr1[i++];
		    else 
                merge[k++]=arr2[j++];
        }
        while(i<5)
  	        merge[k++]=arr1[i++];
        while(j<5)
  	        merge[k++]=arr2[j++];
        System.out.println("\nMerged sorted array is: ");
        for(x = 0 ; x < 10 ; x++)
            System.out.print(merge[x] +" ");
    }
}