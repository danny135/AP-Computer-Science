public class Unit2Activity1Part2
{
	public static void main( String [] args )
	{
		anotherMethod();
		anotherMethod();
	}
	public static void anotherMethod()
	{
		int x = 20;
		System.out.println( "x in anotherMethod() is: " + x );
		x = x + 1;
		System.out.println( "x in anotherMethod() is now: " + x );
	}
}