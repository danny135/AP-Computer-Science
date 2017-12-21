/**
 * Demonstrates the Date class.
 * @author Daniel Ruano
 *
 */
public class DateExcercise 
{
	public static void main(String[] args)
	{
		Date date = new Date();
		int month = Input.getInt("Enter the month.");
		int day = Input.getInt("Enter the day.");
		int year = Input.getInt("Enter the year.");
		
		date.setDate(month, day, year);
		
		System.out.println("The date is " + date.getMonth() + "/" + date.getDay() + "/" + date.getYear());
	}
}
