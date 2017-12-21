import java.util.Scanner;

/**
 * Asks the user for 10 integers and then prints out the smallest and largest.
 * @author Daniel Ruano
 *
 */
public class Unit4Lab1C 
{

	public static void main(String[] args) 
	{
		int counter = 0, number, smallest = 0, largest = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 integers: ");
		do
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
		while (counter < 10);
		
		System.out.println("Smallest: " + smallest);
		System.out.println("Largest: " + largest);
	}
}
