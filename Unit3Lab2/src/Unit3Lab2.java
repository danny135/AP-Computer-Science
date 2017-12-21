import java.util.Scanner;


/**
 * Checks the validity and type of a triangle.
 * @author Daniel Ruano
 *
 */
public class Unit3Lab2 
{	
	int side1, side2, side3;
	
	public Unit3Lab2() 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three integer lengths for the sides of a triangle: ");
		side1 = input.nextInt();
		side2 = input.nextInt();
		side3 = input.nextInt();
		input.close();
		
		System.out.println("Sides: " + side1 + ", " + side2 + ", " + side3);
		System.out.println("Type: " + getType(side1, side2, side3));
		if (!isValid(side1, side2, side3))
		{
			System.out.println("The values entered do not make a valid triangle.");
		}
	}
	
	/**
	 * 
	 * @param s1 A side of the triangle.
	 * @param s2 A side of the triangle.
	 * @param s3 A side of the triangle.
	 * @return Whether the provided sides make a valid triangle.
	 */
	private boolean isValid(int s1, int s2, int s3)
	{
		if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) //Check the sum of sides
		{
			return false;
		}
		else if (s1 <= 0 || s2 <= 0 || s3 <= 0) //Check lengths
		{
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @param s1 A side of the triangle.
	 * @param s2 A side of the triangle.
	 * @param s3 A side of the triangle.
	 * @return The type of triangle.
	 */
	private String getType(int s1, int s2, int s3)
	{
		if (s1 == s2 && s2 == s3)
		{
			return "Equilateral";
		}
		else if (s1 == s2 && s2 != s3 || s2 == s3 && s3 != s1 || s3 == s1 && s1 != s2)
		{
			return "Isosceles";
		}
		return "Scalene";
	}

	public static void main(String[] args) 
	{
		new Unit3Lab2();
	}
}
