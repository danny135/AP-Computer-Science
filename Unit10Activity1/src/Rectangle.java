
public class Rectangle 
{
	double length, width;
	
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	
	public Rectangle(double length, double width)
	{
		setSides(length, width);
	}

	protected void setLength(double length)
	{
		if (length > 0) this.length = length;
	}
	
	protected void setWidth(double width)
	{
		if (width > 0) this.width = width;
	}
	
	protected void setSides(double length, double width)
	{
		setLength(length);
		setWidth(width);
	}
	
	public double getLength()
	{
		return length;
	}

	public double getWidth()
	{
		return width;
	}
}
