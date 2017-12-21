/**
 * Uses different methods of the StringBuilder class.
 * @author Daniel Ruano
 *
 */
public class Unit7Actvity2 
{	
	public static void main(String[] args) 
	{
		StringBuilder str = new StringBuilder("Where to you want to go?");
		System.out.println(str);
		
		str.setCharAt(str.indexOf("t"), 'd');
		System.out.println(str);
		
		str.insert(str.indexOf(" "), "ver");
		str.insert(str.indexOf("?"), " today");
		System.out.println(str);
		
		str.delete(str.indexOf("ver"), str.indexOf(" "));
		str.delete(str.lastIndexOf(" "), str.indexOf("?"));
		System.out.println(str);
	}
}
