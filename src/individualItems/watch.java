package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class watch
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public watch( String i, String n, String d, String p)
	{	

		this.item = i;
		this.name = n;
		this.description = d;
		this.price = p;
	}

	public String toString() 
	{
		//toString
		return ( "\n" + item + "\n" + name + "\n" + description + "\n" + price);
	}
	
	public static String main(String[] args)
	{
	
	
		
		//add apparel
		watch watch = new watch("#206","Apple Watch Series 5", 
				"Always-On retina display, Ultra-low power LTPO display,\n all-day battery life", "$400.00");

		System.out.println(watch);
		
		
		return watch.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}