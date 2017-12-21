import java.util.Scanner;


/**
 * Finds the circumference, diameter, and area of a circle after the user enters a value for the radius.
 * 
 * @author Daniel Ruano
 *
 */
public class Unit2Lab1 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		double radius, diameter, circumference, area, PI = 3.14159f;
		System.out.print("Enter the radius of a circle: ");
		radius = input.nextDouble();
				
		diameter = radius * 2;
		circumference = diameter * PI;
		area = PI * radius*radius;
	
		System.out.println("\nDiameter: " + diameter);
		System.out.println("Circumference: " + circumference);
		System.out.println("Area: " + area);
		
		System.out.println();
	}
}