package Linked_List;

public class BTS_Albums 
{
	//make objects
	String name;
	String description;
	String price;
	
	public BTS_Albums(String n, String d, String p)
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
		BTS_Albums MapSoul7 = new BTS_Albums("Map of the Soul: 7", 
				"4 versions, photobook, lyric book, minibook, postcard, sticker, poster", "$25.00");
		BTS_Albums MapSoulPersona = new BTS_Albums("Map of the Soul: Persona", 
				"4 versions, photobook, sticker, minibook", "$18.00");
		BTS_Albums Wings = new BTS_Albums("BTS 2nd Album[Wings]", 
				"1 CD, photobook, photocard, poster", "$21.00");
		BTS_Albums Answer = new BTS_Albums("Love Yourself: Answer", 
				"2 CDs, photobook, photocard, poster", "$21.00");
		BTS_Albums Tear = new BTS_Albums("Love Yourself: Tear", 
				"1CD, photobook, dual member photocard, poster", "$23.00");
		BTS_Albums DarkWild = new BTS_Albums("BTS 1st Album [Dark & Wild]", 
				"1 CD, 2 animation pictures, 2 photocards", "$18.00");
		BTS_Albums NeverWalk = new BTS_Albums("You Never Walk Alone", 
				"1 CD, photobook, photocard, poster", "$23.00");

		System.out.println(MapSoul7);
		System.out.println(MapSoulPersona);
		System.out.println(Wings);
		System.out.println(Answer);
		System.out.println(Tear);
		System.out.println(DarkWild);
		System.out.println(NeverWalk);
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
