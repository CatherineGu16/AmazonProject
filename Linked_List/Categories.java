package Linked_List;

import java.util.ArrayList;
import java.util.LinkedList;

import Linked_List.CircleQueue;


public class Categories
{
	private CircleQueue products;
	private int size = 5;	

	public Categories()
	{
		  products = new CircleQueue();
	}

	public void addproducts()
	  {
		//add products
    	products.add(new Products("Tucker", "Golden Retriever", ""));
    	System.out.println("products: " + products);
    	products.add(new Products("Kai", "German Shepherd", ""));
    	System.out.println("products: " + products);
    	products.add(new Products("Spots", "Labrador", ""));
    	System.out.println("products: " + products);
    	products.add(new Products("Maya", "Samoyed", ""));
    	System.out.println("products: " + products);
    	products.add(new Products("Trixie", "Pitbull", ""));
    	System.out.println("products: " + products);
    	products.add(new Products("Rex", "Border Collie", ""));
    	System.out.println("products: " + products);

	  }
	
	public void removeproducts()
	  {
		  	// popping data off stack with console output
		  	for (int i = size; i >= 0; i--)
		  	{
				 System.out.println("Delete:" + products.delete() + " " + products);						
		  	}
	  }

	  /**
	   *  Display the top element of the list and full stack
	   */
	  public void displayQueue()
	  {
	    System.out.println("First Element: " + products.getFirstObject() );
	    System.out.println("Last Element: " + products.getLastObject() );
	    System.out.println("Complete Queue: " + products);
	  }
	
	
	public static void main(String args[])
	{
		Categories products = new Categories();

	    products.addproducts();
	    products.displayQueue();
	    products.removeproducts();
	}
}
