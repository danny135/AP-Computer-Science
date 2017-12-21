import java.util.Scanner;

/**
 * Asks the user for 10 integers and then prints out the smallest and largest.
 * @author Daniel Ruano
 *
 */
public class Unit4Lab1A 
{

	public static void main(String[] args) 
	{
		int counter = 0, number, smallest = 0, largest = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 integers: ");
		while (counter < 10)
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

			counter++;
		}
		
		System.out.println("Smallest: " + smallest);
		System.out.println("Largest: " + largest);
	}
}
