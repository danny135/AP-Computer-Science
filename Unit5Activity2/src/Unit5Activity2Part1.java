/**
 * Gets the maximum and minimum of groups of three numbers.
 * @author Daniel Ruano
 *
 */
public class Unit5Activity2Part1 
{
	
	public double minimum(double x, double y, double z)
	{
		return Math.min(Math.min(x, y), z);
	}
	
	public double maximum(double x, double y, double z)
	{
		return Math.max(Math.max(x, y), z);
	}

	public static void main(String[] args) 
	{
		Unit5Activity2Part1 math = new Unit5Activity2Part1();
		System.out.println("Maximums:");
		System.out.println("(19.0, 50.0, 10.0):\t" + math.maximum(19.0, 50.0, 10.0));
		System.out.println("(3.0, 1.0, 3.0):\t" + math.maximum(3.0, 1.0, 3.0));
		System.out.println("(500.0, 45.0, 45.0):\t" + math.maximum(500.0, 45.0, 45.0));
		
		System.out.println("\nMinimums:");
		System.out.println("(1.0, 2.0, 1.0):\t" + math.minimum(1.0, 2.0, 1.0));
		System.out.println("(-100.0, 100.0, 99.0):\t" + math.minimum(-100.0, 100.0, 99.0));
		System.out.println("(10.0, 30.0, 25.0):\t" + math.minimum(10.0, 30.0, 25.0));
	}

}
