
class point3D extends point2D
{
	float z=0.0f;

	point3D(float a,float b,float c)
	{
		super(a,b);
		z=c;
	}
	point3D()
	{
		super();

	}
	float getZ()
	{
		return z;
	}
	void setZ(float c)
	{
		z=c;
	}
	void setXYZ(float a,float b,float c)
	{
		setXY(a,b);
		z=c;
	}
	float[] getXYZ()
	{
		float f1[]=new float[3];
		f1=getXY();
		f1[2]=z;
		return (f1);
	}
	String tostring()
	{
		return (x+" "+y+""+z);
	}
}
