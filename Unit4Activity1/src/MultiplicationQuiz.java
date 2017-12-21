import java.util.Scanner;

/**
 * A fun multiplication quiz!
 * @author Daniel Ruano
 *
 */
public class MultiplicationQuiz
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		System.out.print("How many multiplication problems would you like?");
		int problems = input.nextInt(),
			correct = 0;
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < problems; i++)
		{
			// Generate 2 random numbers that will be multiplied
			int number1 = (int) (Math.random() * 10), 
				number2 = (int) (Math.random() * 10);
			// Prompt user to input answer
			System.out.print( "\nWhat is " + number1 + " * " + number2 + "? " );
			
			int answer = input.nextInt(), correctAnswer = number1 * number2;
			// Grade the answer
			if (correctAnswer == answer)
			{
				System.out.println( "Congratulations...you are correct!" );
				correct++;
			}
			else
			{
				System.out.println("Incorrect, the answer is " +  correctAnswer + ".");
			}
		}
		
		long delta = System.currentTimeMillis();
		
		System.out.println("\nYou got " + correct + " out of " + problems + " correct (" + (correct*100/(float)problems) + "%).");
		System.out.println("It took you " + ((delta - start) / 1000.0)  + " seconds to complete the quiz.");
	}
}