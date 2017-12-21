
public class Date 
{
	private int month, day, year;
	
	/*
	 * Initializes the date fields to a default value.
	 */
	public Date() 
	{
		month = 0;
		day = 0;
		year = 0;
	}
	
	/**
	 * Sets the date according to some basic date rules.
	 * The month must be an integer between 1 and 12, 
	 * the day must be an integer between 1 and 31 (individual months not considered),
	 * the year must be zero or greater.
	 * @param month The month of the year.
	 * @param day The day of the month.
	 * @param year The year of the date.
	 */
	public void setDate(int month, int day, int year)
	{
		if (month < 1 || month > 12)
		{
			throw new IllegalArgumentException("Invalid month.");
		}
		else if (day < 1 || day > 31)
		{
			throw new IllegalArgumentException("Invalid day.");
		}
		else if (year < 0)
		{
			throw new IllegalArgumentException("Invalid year.");
		}
		else
		{
			this.month = month;
			this.day = day;
			this.year = year;
		}
	}
	
	/**
	 * The date should be set before using this function.
	 * The month will not change after this function ends.
	 * @return The month of the year.
	 */
	public int getMonth()
	{
		return this.month;
	}
	
	/**
	 * The date should be set before using this function.
	 * The day will not change after this function ends.
	 * @return The day of the month.
	 */
	public int getDay()
	{
		return this.day;
	}
	
	/**
	 * The date should be set before using this function.
	 * The year will not change after this function ends.
	 * @return The year of the date.
	 */
	public int getYear()
	{
		return this.year;
	}
}
