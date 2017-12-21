import java.util.Scanner;

/**
 * Asks the user for 10 integers and then prints out the smallest and largest.
 * @author Daniel Ruano
 *
 */
public class Unit4Lab1B
{

	public static void main(String[] args) 
	{
		int number, smallest = 0, largest = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 integers: ");
		for (int counter = 0; counter < 10; counter++)
		{
			number = input.nextInt();
			
			if (counter == 0)
			{
				smallest = number;
				largest = number;
			}
			else
			{
				if (number < smallest)
				{
					smallest = number;
				}
				if (largest < number)
				{
					largest = number;
				}
			}
		}
		
		System.out.println("Smallest: " + smallest);
		System.out.println("Largest: " + largest);
	}
}
