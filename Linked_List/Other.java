package Linked_List;

public class Other 
{
	//make objects
	String name;
	String description;
	String price;
	
	public Other(String n, String d, String p)
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
		//add miscellaneous objects
		Other popsocket = new Other("Pop socket", 
				"", "$8.00");
		Other iPhoneCase = new Other("iPhone Case", "", "");
		Other p = new Other("", "", "");
		Other i = new Other("", "", "");
		Other g = new Other("", "", "");
		Other s = new Other("", "", "");
		Other f = new Other("", "", "");

		System.out.println(popsocket);
		System.out.println(iPhoneCase);
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

