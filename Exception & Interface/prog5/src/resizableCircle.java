class ResizableCircle extends Circle implements Resizable
{
	ResizableCircle(double r)
	{
	super(r);
	}
	public void resize(int percent)
	{
		System.out.println((int) radius+((percent/100)*radius));
	}
}