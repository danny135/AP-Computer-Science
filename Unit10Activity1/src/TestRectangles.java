
public class TestRectangles 
{

	public static void main(String[] args) 
	{	
		Rectangle rect = new Rectangle(
				Input.getDouble("Enter a length for the Rectangle."),
				Input.getDouble("Enter a width for the Rectangle.")
				);
		
		System.out.println("Rectangle: (" + rect.length + ", " + rect.width + ")");
		
		EnhancedRectangle eRect = new EnhancedRectangle(
				Input.getDouble("Enter a length for the EnhancedRectangle."), 
				Input.getDouble("Enter a width for the EnhancedRectangle.")
				);
		
		System.out.println("EnhancedRectangle: (" + eRect.length + ", " + eRect.width + ")");
	}

}
