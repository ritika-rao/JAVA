import java.io.*;
class numRead
{
	File f=null;
	int[] N;
	void numfileread()
	{
		N=new int[10];
	try
	  {
	  	f=new File("num.txt");
	   FileReader fin = new FileReader(f);
	   BufferedReader bin=new BufferedReader(fin);
	   for(int i=0;i<10;i++)
	   {
	   	N[i]=Integer.parseInt(bin.readLine());
	   }
	  }
	  catch(Exception e){}
	  for(int i=0;i<10;i++)
	  {
	  	System.out.println(N[i]+" ");
	  }
		System.out.println("-------------------------------------------");
		System.out.println("Content after sorting");
		for (int i=0;i<10;i++)
		{
			for (int j=0;j<10;j++)
			{
				if(N[i]<N[j])
				{
					int t=N[i];
					N[i]=N[j];
					N[j]=t;
				}
			}
		}
		for(int k=0;k<10;k++)
		{
				System.out.println(N[k]);
		}
		try
		{
			f=new File("num.txt");
			FileWriter fout=new FileWriter(f);
			BufferedWriter bout =new BufferedWriter(fout);
			for(int k=0;k<10;k++)
			{
				bout.write(Integer.toString(N[k]));
				bout.newLine();
			}
			bout.close();
			System.out.println("written successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	
class mainclass
{
	public static void main(String[] args)
	{
		numRead nr=new numRead();
		nr.numfileread();
		System.out.println("------------------" );
		//numRead nw=new numRead();
		//nw.fileWrite();
	}
}