
public class Counter 
{
	private int count;
	
	/*
	 * Initialize the counter to zero.
	 */
	public Counter() 
	{
		reset();
	}
	
	/**
	 * Creates the counter with the provided start value.
	 * @param count Initial counter value.
	 */
	public Counter(int count)
	{
		this.count = count;
	}

	/**
	 * Increases the count by one.
	 */
	public void increment()
	{
		count++;
	}
	
	/**
	 * Decreases the count by one.
	 */
	public void decrement()
	{
		count--;
	}
	
	/**
	 * Resets the counter to zero.
	 */
	public void reset()
	{
		count = 0;
	}
	
	public int getCount()
	{
		return count;
	}
}
