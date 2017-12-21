
public class EnhancedRectangle extends Rectangle 
{
	public EnhancedRectangle(double length, double width) 
	{
		setSides(length, width);
	}
	
	public double getArea()
	{
		return getLength() * getWidth();
	}
}
