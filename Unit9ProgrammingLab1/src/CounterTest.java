
public class CounterTest 
{
	CounterConsoleMenu console;
	
	public static void main(String[] args) 
	{
		new CounterTest();
	}
	
	public CounterTest()
	{
		console = new CounterConsoleMenu();
		int input;
				
		do
		{
			console.displayMenu();
			console.displayCount();
			
			input = console.getInput();
			console.modifyCount(input);
			
		} while (input != CounterConsoleMenu.QUIT);
	}

}
