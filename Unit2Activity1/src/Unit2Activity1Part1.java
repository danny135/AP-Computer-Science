public class Unit2Activity1Part1
{
	public static void main( String [] args)
	{
		int x = 10;
		System.out.println("x in main() is: " + x);
		anotherMethod();
		System.out.println("x in main() is: " + x);
	}
	
	public static void anotherMethod()
	{
		int x = 20;
		System.out.println("x in anotherMethod() is: " + x);
	}
}