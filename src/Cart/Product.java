package Cart;

import java.text.NumberFormat;

public class Product
{
    private String name;
    private double price;
    private int quantity;
    private double subtotal;


    // -------------------------------------------------------
    //  Create a new item with the given attributes.
    // -------------------------------------------------------
    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;


        subtotal = price*quantity;


    }
    public Product2(String itemName, double itemPrice, int quantity) {
        // TODO Auto-generated constructor stub
    }

    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t\t    " + fmt.format(price) + "\t    " + quantity 
                + "\t\t" + fmt.format(subtotal));
    }

    //   Returns the unit price of the Product
    public double getPrice()
    {
        return price;
    }

    //   Returns the name of the Product
    public String getName()
    {
        return name;
    }

    //   Returns the quantity of the Product
    public int getQuantity() {
        return quantity;
    }

    //   Returns the sub total of the Product
    public double getSubTotal()
    {
        return subtotal;
    }

}//end of class Item  