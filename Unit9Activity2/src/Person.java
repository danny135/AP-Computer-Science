/**
 * A person with a first name, a last name, and a birthday.
 * @author Daniel Ruano
 *
 */
public class Person 
{
	private Name firstName, lastName;
	private Date birthDay;
	
	/**
	 * Creates the person with default values.
	 * Every field is initialized.
	 */
	public Person() 
	{
		firstName = new Name("None");
		lastName = new Name("None");
		birthDay = new Date();
	}
	
	/**
	 * Creates two new Name objects with the name strings and stores the date object.
	 * Every field is initialized.
	 * @param firstName The person's first name.
	 * @param lastName The person's last name.
	 * @param birthDay The person's birthdate.
	 */
	public Person(String firstName, String lastName, Date birthDay)
	{
		this.firstName = new Name(firstName);
		this.lastName = new Name(lastName);
		this.birthDay = birthDay;
	}
	
	/**
	 * Stores every argument in a field.
	 * Every field is initialized.
	 * @param firstName The person's first name.
	 * @param lastName The person's last name.
	 * @param birthDay The person's birthdate.
	 */
	public Person(Name firstName, Name lastName, Date birthDay)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}
	
	/**
	 * 
	 * @return A string object representing the person's first name.
	 */
	public String getFirstName()
	{
		return firstName.toString();
	}
	
	/**
	 * 
	 * @return A string object representing the person's last name.
	 */
	public String getLastName()
	{
		return lastName.toString();
	}
	
	/**
	 * Creates a new string by concatenating the first and last name and returns it.
	 * @return A string object representing the person's first and last name.
	 */
	public String getFullName()
	{
		return getFirstName() + " " + getLastName();
	}
	
	/**
	 * Returns a new string with the birthday.
	 * @return Returns a string object representing the person's birthday.
	 */
	public String getBirthDayString()
	{
		return birthDay.toString();
	}

}
