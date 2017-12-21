
/**
 * Demonstrates the person class.
 * @author Daniel Ruano
 *
 */
public class Unit9Activity2 
{

	public static void main(String[] args) 
	{
		Person tony = new Person("Tony", "Baggadonuts", new Date(10, 21, 2001));
		System.out.println("Name: " + tony.getFullName());
		System.out.println("Birthday: " + tony.getBirthDayString());
	}

}
