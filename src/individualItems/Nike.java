package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Nike
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Nike( String i, String n, String d, String p)
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
		Nike Nike = new Nike("#003","Nike Air Zoom Pegasus", 
				"cooling perforations, breathability across high-heat areas,\n reduce bulk without compromising comfort, Color: thunder gray", 
				"$120.00");
		
		System.out.println(Nike);
		
		
		return Nike.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}