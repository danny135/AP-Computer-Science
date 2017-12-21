import java.util.Scanner;

/**
 * A random number guessing game. 
 * If the user guesses correctly he wins, 
 * if not, he is told if the number is 
 * higher or lower than the secret number.
 * @author Daniel Ruano
 *
 */
public class Unit4Lab2 
{

	public static void main(String[] args) 
	{
		int guess, answer, maxNum, maxGuess;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the maximum: ");
		maxNum = input.nextInt();
		System.out.print("How many guesses would you like? ");
		maxGuess = input.nextInt();
		
		answer = (int) (maxNum * Math.random()) + 1;
		
		for (int i = 0; i < maxGuess; i++)
		{
			System.out.print("Enter a number between 1 and " + maxNum + ": ");
			guess = input.nextInt();
			if (guess == answer)
			{
				System.out.println("Correct.");
				break;
			}
			else if (guess < answer)
			{
				System.out.println("Too low.");
			}
			else if (guess > answer)
			{
				System.out.println("Too high.");
			}
		}
	}
}
