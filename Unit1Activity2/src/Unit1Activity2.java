import java.lang.Math;

/**
 * This program does some Math stuff.
 * 
 * @author Daniel Ruaño
 *
 */
public class Unit1Activity2 
{
	public static void main(String[] args)
	{
		System.out.println("Math has " + Math.class.getMethods().length + " methods.");
		System.out.println(Math.max(15, 25) + " is bigger than " + Math.min(15, 25) + ".");
		System.out.println("The absolute value of -25 is " + Math.abs(-25) + ".");
		System.out.println("The square root of 25 is " + Math.sqrt(25) + ".");
		System.out.println("A right triangle with a leg of length 3 "
				+ "and a leg of length 4 has a hypotenuse of length "
				+ Math.hypot(3, 4) + ".");
	}
}
