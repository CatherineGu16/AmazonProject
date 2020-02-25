package Linked_List;

public class Apparel 
{
	//make objects
	String name;
	String description;
	String price;
	
	public Apparel(String n, String d, String p)
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
		//add BTS albums
		Apparel Tshirt = new Apparel("10 pack white T-shirts", 
				"10 count, white 100% cotton T-shirts, size: L", "$15.00");
		Apparel ParachutePants = new Apparel("Parachute pants", 
				"Gold, parachute pants with elastic wasteband, fits most tetens and adults", "$18.00");
		Apparel Nike = new Apparel("Nike Air Zoom Pegasus", 
				"cooling perforations, breathability across high-heat areas, reduce bulk without compromising comfort, Color: thunder gray", 
				"$120.00");
		Apparel Crocs = new Apparel("Balenciaga Platform Crocs", 
				"maximum shock absorbance, odor and water resistant, 15 cm platform, made in Wuhan", "$850.00");
		Apparel Hoodie = new Apparel("Under Armour Hoodie", 
				"maximum comfort, air-jet yarn, 50% cotton 50% polyester", "$34.00");
		Apparel Uggs = new Apparel("Thigh-high Uggs", 
				"fashionable, wedge heel, 22'' shaft height, 2' heel height, water repellant", "$300.00");
		Apparel Jeans = new Apparel("Advanced Stretch Skinny Jeans", 
				"64% cotton 21% Modal 14% Lyocell 1% Elastane, dark wash denim, fading contrast stitching", "$25.00");

		System.out.println(Tshirt);
		System.out.println(ParachutePants);
		System.out.println(Nike);
		System.out.println(Crocs);
		System.out.println(Hoodie);
		System.out.println(Uggs);
		System.out.println(Jeans);
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
