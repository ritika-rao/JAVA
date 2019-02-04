import java.io.*;
import java.util.*;
class inputoutput
{
	public static void main(String[] args)
	{
		char ch;
		File g=null;
		try
		{
			g=new File("garde.txt");
			FileWriter fout=new FileWriter(g);
			BufferedWriter bout =new BufferedWriter(fout);
			Scanner in=new Scanner(System.in);
			System.out.println("Enter serial no. : ");
			int sr=in.nextInt();
			in.nextLine();
			bout.write(Integer.toString(sr));
			bout.newLine();
			do{
			System.out.println("Enter First Name : ");
			bout.write(in.nextLine());
			bout.newLine();
			//bout.close();
			System.out.println("Enter CGPA : ");
			float c=(float)in.nextDouble();
			bout.write(Float.toString(c));
			bout.newLine();
			System.out.println("Enter Grade: ");
			bout.write(in.next().charAt(0));
			bout.newLine();
			System.out.println("To make further Entries press 'y'");
			ch=in.next().charAt(0);
            }
            while(ch=='y');
		 	bout.close();
		 
		 	System.out.println("\n");
		 	FileReader fin=new FileReader(g);
		 	BufferedReader bin=new BufferedReader(fin);
		 	String ar;
		 	System.out.println("The contents of file are : ");
		 	while((ar=bin.readLine())!=null)
		 	{
		 		System.out.println(ar);
		 	}
		 }

		 catch(Exception e)
		 {
		 	e.printStackTrace();
		 }

	}
}