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
				"multi-colored graphic with glossy finish, offers secure grip on phone", "$8.00");
		Other iPhoneCase = new Other("Otterbox Symmetry Case", 
				"synthetic rubber, ultra thin, raised bumper", "$45.00");
		Other tennisballs = new Other("Penn Pro Tennis Balls", 
				"longest lasting tennis balls, LongPlay felt", "$80.00");
		Other pencil = new Other("Papermate Clearpoint Mechanical Pencils", 
				"0.05 mm, convenient click, twist eraser, comfort grip", "$5.00");
		Other necklace = new Other("Diamond and Blue Sapphire Halo Necklace", 
				"New 28.9 ctw diamond, gold, and sapphire", "$45950");


		System.out.println(popsocket);
		System.out.println(iPhoneCase);
		System.out.println(tennisballs);
		System.out.println(pencil);
		System.out.println(necklace);
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

