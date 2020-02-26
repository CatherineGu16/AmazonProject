package Linked_List;
import UI.*;
public class Electronics 
{
	//make objects
	String name;
	String description;
	String price;
	
	public Electronics(String n, String d, String p)
	{
		this.name = n;
		this.description = d;
		this.price = p;
	}

	public String toString() 
	{
		//toString
		return (name + " " + description + " " + price);
	}
	
	public static void main(String[] args)
	{
		//add electronics
		Electronics dell = new Electronics("Dell-Inspiron 15.6''", "Touchscreen, Intel Core i5, 8GB Memory, color: black", "$500.00");
		Electronics macbook = new Electronics("13-inch Macbook Pro", "1.4GHz Quad-Core Processor, touchbar, touch ID, 256 GB", "$1499.00");
		Electronics iPhonePro = new Electronics("iPhone 11 Pro Max", "Triple-camera system, 256 GB, Color: Space Gray", "$1249.00");
		Electronics iPad = new Electronics("12.9 inch iPad Pro", 
				"Liquid retina display, 12-megapixel camera, true tone display, 256 GB, color: silver", "$1149.00");
		Electronics TV = new Electronics("50-inch Samsung Smart 4K Ultra HD TV", "2 HDMI ports, Pur Color, connect & share", "$300.00");
		Electronics watch = new Electronics("Apple Watch Series 5", 
				"Always-On retina display, Ultra-low power LTPO display, all-day battery life", "$400.00");


		System.out.println(dell);
		System.out.println(macbook);
		System.out.println(iPhonePro);
		System.out.println(iPad);
		System.out.println(TV);
		System.out.println(watch);
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

