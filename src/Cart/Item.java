package Cart;

import java.text.NumberFormat;

public class Item
{

	private static String name;

	private static double price;


	// -------------------------------------------------------

	// Create a new item with the given attributes.

	// -------------------------------------------------------

	public Item(String itemName, double itemPrice)
	{
		name = itemName;
		price = itemPrice;
	}

	// -------------------------------------------------------

	// Return a string with the information about the item

	// -------------------------------------------------------

	public String toString()

	{

		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		return (name + "\t" + fmt.format(price) + "\t"

				+ fmt.format(price));
	}

	// -------------------------------------------------
	// Returns the unit price of the item
	// -------------------------------------------------

	public static double returnPrice() {
		return price;
	}

	// -------------------------------------------------
	// Returns the name of the item

	// -------------------------------------------------

	public static String getName() {
		return name;
	}

	// -------------------------------------------------
	// Returns the quantity of the item
	// -------------------------------------------------

}