package Linked_List;

public class Snacks 
{
	//make objects
	String name;
	String description;
	String price;
	
	public Snacks(String n, String d, String p)
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
		Apparel ParachutePants = new Apparel("", "", "");
		Apparel p = new Apparel("", "", "");
		Apparel i = new Apparel("", "", "");
		Apparel g = new Apparel("", "", "");
		Apparel s = new Apparel("", "", "");
		Apparel f = new Apparel("", "", "");

		System.out.println(Tshirt);
		System.out.println(ParachutePants);
		System.out.println(p);
		System.out.println(i);
		System.out.println(g);
		System.out.println(s);
		System.out.println(f);
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

