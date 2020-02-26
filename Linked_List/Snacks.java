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
		Snacks chips = new Snacks("Catherine's chips", "Bestest chips ever, sponsored by Sravani", "$5.00");
		Snacks cookies = new Snacks("Chocolate chip cookies", "Pack of 20 cookies", "$6.00");
		Snacks hotcheetos = new Snacks("Flamin' Hot Cheetos", "Made with real cheese", "$3.00");
		Snacks popcorn = new Snacks("Orville Redenbacher's Ultra Butter Microwave Popcorn", "6 packs of 3.96 oz. popcorn", "$20.88");
		Snacks gummybears = new Snacks("Haribo Gummy Bears", "5 lb, approximately 985 pieces, America's #1 selling gummy bear", "$12.79");
		Snacks goldfish = new Snacks("Pepperidge Farm Xtra Cheddar Goldfish", 
				"Playful cheese crackers baked with a smile, no artificial colors or preservatives", "3.64");
		Snacks bar = new Snacks("Nature Valley Granola Bars", "total 36 bars, made with real ingredients, wholesome snack bar", "17.52");

		System.out.println(chips);
		System.out.println(cookies);
		System.out.println(hotcheetos);
		System.out.println(popcorn);
		System.out.println(gummybears);
		System.out.println(goldfish);
		System.out.println(bar);
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
