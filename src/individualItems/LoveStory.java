package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class LoveStory
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public LoveStory( String i, String n, String d, String p)
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
		LoveStory LoveStory = new LoveStory("#004","Balenciaga Platform LoveStory", 
				"maximum shock absorbance, odor and water resistant, 15 cm platform, made in Wuhan", "$850.00");
		
		System.out.println(LoveStory);
		
		
		return LoveStory.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}