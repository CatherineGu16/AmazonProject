package Cart;

import java.text.NumberFormat;
import java.util.ArrayList;
public class InitialCart
{
    private static int itemCount;      // total number of items in the cart
    private static double totalPrice;  // total price of items in the cart
    private static int capacity; 
    //private static ArrayList<Item> cart4 = new ArrayList<Item>; // current cart capacity
    private static Item[] cart;
    // -----------------------------------------------------------
    //  Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public InitialCart()
    {
      capacity = 5;
      itemCount = 0;
      totalPrice = 0.0;
      cart = new Item[capacity];
    }
    
    // -------------------------------------------------------
    //  Adds an item to the shopping cart.
    // -------------------------------------------------------
    public void addToCart(String itemName, double price)
    {
        cart[itemCount] = new Item(itemName, price);
        itemCount++;
        totalPrice += price;
    }
    
    // -------------------------------------------------------
    //  Returns the contents of the cart together with
    //  summary information.
    // -------------------------------------------------------
    public String toString()
    {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      String contents = "\nShopping Cart\n";
      contents += "\nItem\tPrice\tTotal\n";
      
      for (int i = 0; i < itemCount; i++) 
      //{
    	  contents += cart[i].toString() + "\n";
    	  contents += "\nTotal Price: " + fmt.format(totalPrice);
          contents += "\n";
     // }
     
      return contents;
    }
    
    // ---------------------------------------------------------
    //  Increases the capacity of the shopping cart by 3
    // ---------------------------------------------------------
    private void increaseSize()
    {
        cart = new Item[capacity + 3];
    }
    
    public static double returnPrice()
    {
    	return totalPrice;
    }
    
}