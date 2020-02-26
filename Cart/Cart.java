package Cart;


public class Cart implements Cloneable {
	
	public String itemName;
	public int itemCost;
	public int quantity;

	
	public void CartItem()
	{
		
	}
	
	public void CartItem(String itemName, int itemCost, int quantity)
	{
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.quantity = quantity;

		
	}
	
	public void add(Cart otheritem)
	{ this.quantity = this.quantity + otheritem.quantity;
	
	}


		public void subtract(Cart otherItem)
		{
			this.quantity = this.quantity - otherItem.quantity;
		}



		public boolean equals(Object other)
		{
			if (this == other) return true;

			if (!(other instanceof Cart))
				return false;

			Cart otherItem =
				(Cart) other;

			return (itemName.equals(otherItem.itemName)) &&
				(itemCost == otherItem.itemCost);
		}

	// Create a printable version of this object

		public String toString()
		{
			return itemName+" cost: "+itemCost+" qty: "+quantity;
		}
	}

