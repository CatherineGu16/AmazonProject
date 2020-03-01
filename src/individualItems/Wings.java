package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Wing
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Wing( String i, String n, String d, String p)
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
		Wing Wing = new Wing("#103","BTS 2nd Album[Wings]", 
				"1 CD, photobook, photocard, poster", "$21.00");
		System.out.println(Wing);
		
		
		return Wing.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}