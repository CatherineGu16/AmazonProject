package Linked_List;
import UI.*;
public class Music 
{
	//make objects
	String name;
	String description;
	String price;
	
	public Music(String n, String d, String p)
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
		//add music
		Music Circles = new Music("\"Circles\" by Post Malone", "Time: 3:35", "$1.29");
		Music Chills = new Music("\"Chills\" by Why Don't We", "Time: 2:45", "$1.29");
		Music Partyover = new Music("\"When the Party's Over\" by Billie Eilish", "Time: 3:16", "$1.29");
		Music Beautiful = new Music("\"What Makes You Beautiful\" by One Direction", "Time: 3:19", "$1.29");
		Music Lovestory = new Music("\"Love Story\" by Taylor Swift", "Time: 3:55", "$1.29");
		Music Thankyounext = new Music("\"Thank you, next\" by Ariana Grande", "Time: 3:27", "$1.29");
		Music Memories = new Music("\"Memories\" by Maroon 5", "Time: 3:09", "$1.29");

		System.out.println(Circles);
		System.out.println(Chills);
		System.out.println(Partyover);
		System.out.println(Beautiful);
		System.out.println(Lovestory);
		System.out.println(Thankyounext);
		System.out.println(Memories);
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

