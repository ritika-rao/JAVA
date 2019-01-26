class circle
{
	double radius;
	String color;
	circle()
	{
		this.radius=1.0;
		this.color="red";
	}
	circle(double r)
	{
		this.radius=r;
	}
	circle(double r,String col)
	{
		this.radius=r;
		this.color=col;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		this.radius=r;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String col)
	{
		this.color=col;
	}
	public double getArea()
	{
		double area =3.14*radius*radius;
		return area;
	}
}
 
 class cylinder extends circle
 {
 	double height;
 	cylinder()
 	{
 		this.height=1.0;
 	}
 	cylinder(double r)
 	{
 		this.radius=r;
 	}
 	cylinder(double r,double h)
 	{
 		this.radius=r;
 		this.height=h;
 	}
 	cylinder(double r,double h,String col)
 	{
 		this.radius=r;
 		this.height=h;
 		this.color=col;
 	}
 	public double getHeight()
 	{
 		return height;
 	}
 	public void setHeight(double h)
 	{
 		this.height=h;
 	}
 	public double getVolume()
 	{
 		double volume=(super.getArea())*height;
 		return volume;
 	}
 }
 class cylinder_main
 {
 	public static void main(String[] args)
 	{
 		cylinder cy =new cylinder();
 		System.out.print("volume=  "+cy.getVolume()+"\ncolour: "+cy.getColor()+"\n");

 	}
 }

