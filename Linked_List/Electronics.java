package Linked_List;

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
		Electronics dell = new Electronics("Dell", 
				"fastest laptop", "$999.99");
		Electronics macbook = new Electronics("", "", "");
		Electronics p = new Electronics("", "", "");
		Electronics i = new Electronics("", "", "");
		Electronics g = new Electronics("", "", "");
		Electronics s = new Electronics("", "", "");
		Electronics f = new Electronics("", "", "");

		System.out.println(dell);
		System.out.println(macbook);
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

