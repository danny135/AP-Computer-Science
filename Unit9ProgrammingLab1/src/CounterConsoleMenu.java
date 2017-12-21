
public class CounterConsoleMenu 
{
	public static final int INCREMENT = 1;
	public static final int DECREMENT = 2;
	public static final int RESET = 3;
	public static final int QUIT = 4;
	Counter counter;
	
	public CounterConsoleMenu() 
	{
		counter = new Counter();
	}
	
	public void displayMenu()
	{
		System.out.println(INCREMENT + " - Increment\n"
				+ DECREMENT + " - Decrement\n"
				+ RESET + " - Reset\n"
				+ QUIT + " - Quit\n");
	}
	
	public int getInput()
	{
		return Input.getInt("Select an option.");
	}
	
	public void displayCount()
	{
		System.out.println("Count: " + counter.getCount() + "\n");
	}
	
	public void modifyCount(int operation)
	{
		switch(operation)
		{
			case DECREMENT:
				counter.decrement();
				break;
			case RESET:
				counter.reset();
				break;
			case INCREMENT:
				counter.increment();
				break;
		}
	}
}
