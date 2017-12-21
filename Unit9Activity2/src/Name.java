/**
 * A name represented as a string.
 * @author Daniel Ruano
 *
 */
public class Name 
{
	String name;

	/**
	 * Initializes name to default value.
	 */
	public Name() 
	{
		name = "None";
	}
	
	/**
	 * Creates a name with the provided value.
	 * @param name Name string.
	 */
	public Name(String name) 
	{
		setName(name);
	}

	/**
	 * Sets the name to the provided value.
	 * @param name Name string.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Nothing changes during this function.
	 * @return The current name.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Nothing changes during this function.
	 * @return The current name.
	 */
	public String toString()
	{
		return getName();
		
	}
}
