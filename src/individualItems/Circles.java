package individualItems;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import UI.*;
public class Circles
{
	//make objects
	
	String item;
	String name;
	String description;
	String price;
	
	public Circles( String i, String n, String d, String p)
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

		Circles Circles = new Circles("#301","\"Circles\" by Post Malone", "Time: 3:35", "$1.29");
	
		System.out.println(Circles);
		
		
		return Circles.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}