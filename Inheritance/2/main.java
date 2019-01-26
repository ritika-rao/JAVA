import java.util.*;
class hierarchy
{
	public static void main(String[] args)
	{
		point3D p1=new point3D(7f,4f,3f);
		System.out.println(p1.tostring());
		Scanner in=new Scanner(System.in);
		float a=in.nextFloat();
		float b=in.nextFloat();
		float c=in.nextFloat();
		p1.setXYZ(a,b,c);
		float f[]=p1.getXYZ();
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);

	}

}