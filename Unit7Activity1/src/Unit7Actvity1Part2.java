/**
 * Prints the words of a string twice.
 * @author Daniel Ruano
 *
 */
public class Unit7Actvity1Part2
{
	public static void main(String[] args) 
	{
		String myString = "Where's the Beef?";
		
		printTwice(stringBetween(myString, "W", "s"));
		printTwice(stringBetween(myString, "t", "e "));
		printTwice(stringBetween(myString, "B", "?"));	
	}
	
	public static String stringBetween(String str, String a, String b)
	{
		return str.substring(str.indexOf(a), str.indexOf(b)+1);
	}
	
	public static void printTwice(String str)
	{
		System.out.println(str);
		System.out.println(str);
	}
}
