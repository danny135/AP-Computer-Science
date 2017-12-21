/**
 * Converts between decimal, binary, and hex.
 * @author Daniel Ruano
 *
 */
public class Unit7ProgrammingLab2 
{

	public Unit7ProgrammingLab2() 
	{
		System.out.println("Binary to decimal: " + binaryToDecimal("10") + " = 2");
		System.out.println("Decimal to binary: " + decimalToBinary(4) + " = 100");
		System.out.println("Binary to hex: " + binaryToHex("1111") + " = f");
		System.out.println("Decimal to hex: " + decimalToHex(255) + " = ff");
	}
	
	int binaryToDecimal(String binaryString)
	{
		int decimal = 0, length = binaryString.length();
		
		for (int i = 0; i < length; i++)
		{
			if (binaryString.charAt(i) == '1')
			{
				decimal += Math.pow(2, length - i - 1);
			}
		}
		
		return decimal;
	}
	
	String binaryToHex(String binaryString)
	{
		return decimalToHex(binaryToDecimal(binaryString));
	}
	
	String decimalToBinary(int decimalNumber)
	{
		String binary = "";

		while (decimalNumber > 0)
		{
				  binary = decimalNumber % 2 + binary;
				  decimalNumber /= 2;
		}
		
		return binary;
	}
	
	String decimalToHex(int decimalNumber)
	{
		String hex = "";

		while (decimalNumber > 0)
		{	
			hex = hexChar(decimalNumber % 16) + hex;
			decimalNumber /= 16;
		}
		
		return hex;
	}
	
	String hexChar(int decimal)
	{
		if (0 <= decimal && decimal <= 9) return Integer.toString(decimal);
		if (decimal == 10) return "a";
		if (decimal == 11) return "b";
		if (decimal == 12) return "c";
		if (decimal == 13) return "d";
		if (decimal == 14) return "e";
		if (decimal == 15) return "f";
		return " ";
	}

	public static void main(String[] args) 
	{	
		new Unit7ProgrammingLab2();
	}
}
