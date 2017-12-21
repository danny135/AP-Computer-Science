/**
 * String manipulation.
 * @author Daniel Ruano
 *
 */
public class Unit7Activity1 
{
	static String myString;
	
	public static void main(String[] args) 
	{
		myString = new String("I love my AP computer science course");
		
		display();
		upper();
		lower();
		length();
		fourthUpper();
	}
	
	public static void display()
	{
		System.out.println(myString);
	}
	
	public static void upper()
	{
		System.out.println(myString.toUpperCase());
	}
	
	public static void lower()
	{
		System.out.println(myString.toLowerCase());
	}
	
	public static void length()
	{
		System.out.println(myString.length());
	}
	
	public static void fourthUpper()
	{
		System.out.println(myString.toUpperCase().charAt(3));
	}
}
