import java.io.File;
public class FileDemo
{
	public static void main(String [] args)
	{
		File f=null;
		String strs="FileDemo.java";
		try
		{
			f=new File(strs);
			String a=f.getAbsolutePath();
			System.out.println("\n"+a);
			System.out.println("\nLength=  "+f.length());
		}
		catch(Exception e)
		{	
			e.printStackTrace();
		}
	}
}