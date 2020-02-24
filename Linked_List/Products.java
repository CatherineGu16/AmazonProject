package Linked_List;

public class Products 
{
	//make objects
	String name;
	String description;
	String price;
	
	public Products(String n, String d, String p)
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
		Products firstdog = new Products("Shirt", "A pack of luxurious white shirts", "$20.00");
		Products seconddog = new Products("Kai", "German Shepherd", "");
		Products thirddog = new Products("Spots", "Labrador", "");
		Products fourthdog = new Products("Maya", "Samoyed", "");
		Products fifthdog = new Products("Trixie", "Pitbull", "");
		Products sixthdog = new Products("Rex", "Border Collie", "");

		System.out.println(firstdog);
		System.out.println(seconddog);
		System.out.println(thirddog);
		System.out.println(fourthdog);
		System.out.println(fifthdog);
		System.out.println(sixthdog);
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
