import java.util.Scanner;

/**
 * Asks for a series of nubmers and then outputs different sums of the numbers.
 * 
 * @author Daniel Ruano
 *
 */
public class Unit1Lab2
{
  public static void main( String [] args )
  {
    // Define and initialize variables for values to be input
    int v1 = 0, 
		v2 = 0, 
		v3 = 0, 
		v4 = 0, 
		v5 = 0, 
		v6 = 0, 
		v12 = 0,
    	v34 = 0,
    	v56 = 0,
    	v135 = 0,
    	v246 = 0,
    	v123456 = 0;
    
    // Use a Scanner to input integer values
    Scanner input = new Scanner( System.in );
    System.out.println( "\n\n" );
    System.out.print( "Enter 6 integers separated by a blank space:" );
    v1 = input.nextInt();     // Input first value
    v2 = input.nextInt();     // Input second value
    v3 = input.nextInt();     // Input third value
    v4 = input.nextInt();     // Input fourth value
    v5 = input.nextInt();     // Input fifth value
    v6 = input.nextInt();     // Input sixth value
    
    v12 = v1 + v2;
    v34 = v3 + v4;
    v56 = v5 + v6;
    
    v135 = v1 + v3 + v5;
    v246 = v2 + v4 + v6;
    
    v123456 = v135 + v246;
    
    // Output using System.out.println()
    System.out.println("\n\n");
    System.out.println("\tValue\tValue\tTotal");
    System.out.println("\t" + v1 + "\t" + v2 + "\t" + v12);
    System.out.println("\t" + v3 + "\t" + v4 + "\t" + v34);
    System.out.println("\t" + v5 + "\t" + v6 + "\t" + v56);
    System.out.println("\t-----\t-----\t-----");
    System.out.println("Total\t" + v135 + "\t" + v246 + "\t" + v123456);
    System.out.println("\n\n");
  }
}