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
		//add snacks
		Snacks chips = new Snacks("Catherine's chips", 
				"10 count, white 100% cotton T-shirts, size: L", "$15.00");
		Snacks cookies = new Snacks("", "", "");
		Snacks hotcheetos = new Snacks("", "", "");
		Snacks i = new Snacks("", "", "");
		Snacks g = new Snacks("", "", "");
		Snacks s = new Snacks("", "", "");
		Snacks f = new Snacks("", "", "");

		System.out.println(snacks);
		System.out.println(cookies);
		System.out.println(hotcheetos);
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

