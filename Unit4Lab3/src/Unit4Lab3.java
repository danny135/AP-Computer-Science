import java.util.Scanner;

/**
 * Asks the user for a number and then prints out decreasing asterisk lines starting at that length.
 * @author Daniel Ruano
 *
 */
public class Unit4Lab3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter max asterisks: ");
	
		for (int i = input.nextInt(); i >= 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
