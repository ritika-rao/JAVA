import java.io.*;
class FileDemo2
{
	public static void main(String[] args)
	{
		File f=null;
		try
		{
			f=new File("file1.txt");
			FileReader fin=new FileReader(f);
			BufferedReader bin=new BufferedReader(fin);
			String ar;
			System.out.println("The contents of the file are:  ");
			while((ar=bin.readLine())!=null)
			{
				System.out.println(ar);
			}
		}
		catch(Exception e)
		{
			//if any I/O error occurs
			e.printStackTrace();
		}
	}
	
}