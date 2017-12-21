import java.util.Scanner;

/**
 * Calculates the prices and discounts 
 * for different inputs of order 
 * amounts and customer categories.
 * 
 * @author Daniel Ruano
 * 
 */
public class Unit3Lab1 
{	
	int orderQuantity, customerCategory;
	double grossOrderAmount, discountPercentage, discountAmount, netOrderAmount;
	
	public Unit3Lab1() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter order quantity and customer category: "); 
		orderQuantity = input.nextInt();
		customerCategory = input.nextInt();
		input.close();
		
		grossOrderAmount = getGrossOrderAmount(orderQuantity);
		discountPercentage = getDiscount(orderQuantity, customerCategory);
		discountAmount = getDiscountAmount(grossOrderAmount, discountPercentage);
		netOrderAmount = getNetOrderAmount(grossOrderAmount, discountAmount);
		
		System.out.println("\nOrder Quantity: " + orderQuantity
				+ "\nCustomer Category: " + customerCategory
				+ "\nGross order amount: $" + grossOrderAmount
				+ "\nDiscount percentage: " + round(discountPercentage, 2) + "%"
				+ "\nDiscount amount: $" + round(discountAmount, 2)
				+ "\nNet order amount: $" + round(netOrderAmount, 2));
	}
	
	/**
	 * 
	 * @param grossAmount The gross order amount.
	 * @param discountAmount The discounted total.
	 * @return The net order amount.
	 */
	private double getNetOrderAmount(double grossAmount, double discountAmount)
	{
		return grossAmount - discountAmount;
	}
	
	/**
	 * 
	 * @param grossAmount The gross order amount.
	 * @param discount The discount percent.
	 * @return The discounted total.
	 */
	private double getDiscountAmount(double grossAmount, double discount)
	{
		return grossAmount * (1.0 - discount);
	}
	
	/** 
	 * 
	 * @param quantity The amount of widgets.
	 * @return The gross order amount.
	 */
	private double getGrossOrderAmount(int quantity)
	{
		return 299.00 * quantity;
	}
	
	/**
	 * 
	 * @param amount The amount of widgets being purchased.
	 * @param category The customer's category.
	 * @return The percent discount.
	 */
	private double getDiscount(int amount, int category)
	{
		if (category < 1 || category > 3)
		{
			throw new IllegalArgumentException("Invalid category.");
		}
		else if (amount <= 0)
		{
			throw new IllegalArgumentException("Invalid amount.");
		}
		
		double discount = 0.00f; 
		
		if (category == 1)
		{
			if (amount >= 1 && amount <= 100)
			{
				discount = 0.02f;
			}
			else if (amount > 100 && amount <= 500)
			{
				discount = 0.05f;
			}
			else if (amount > 500)
			{
				discount = 0.08f;
			}
		}
		else if (category == 2 || category == 3)
		{
			if (amount >= 1 && amount <= 100)
			{
				discount = 0.00f;
			}
			else if (amount > 100 && amount <= 500)
			{
				discount = 0.03f;
			}
			else if (amount > 500)
			{
				discount = 0.05f;
			}
		}
		
		return discount;
	}
	
	/**
	 * 
	 * @param value The number to be rounded.
	 * @param places The amount of decimal places to round to.
	 * @return The rounded number.
	 */
	private double round(double value, int places)
	{
		double power =  Math.pow(10, places);
		return Math.round(value * power) / power;
	}
	
	public static void main(String[] args) 
	{
		new Unit3Lab1();
	}
}
