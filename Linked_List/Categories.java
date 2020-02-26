package Linked_List;

import java.util.ArrayList;
import java.util.LinkedList;

import Linked_List.CircleQueue;


public class Categories
{
	private CircleQueue BTS_albums;
	private CircleQueue Apparel;
	private CircleQueue Music;
	private CircleQueue Snacks;
	private CircleQueue Electronics;
	private CircleQueue Other;
	private int size = 5;	

	public Categories()
	{
		  BTS_albums = new CircleQueue();
		  Apparel = new CircleQueue();
		  Music = new CircleQueue();
		  Snacks = new CircleQueue();
		  Electronics = new CircleQueue();
		  Other = new CircleQueue();
	}

	public void addBTS()
	  {
		//add BTS Albums
    	BTS_albums.add(new BTS_Albums("Map of the Soul: 7", 
				"4 versions, photobook, lyric book, minibook, postcard, sticker, poster", "$25.00"));
    	System.out.println("BTS: " + BTS_albums);
    	BTS_albums.add(new BTS_Albums("Map of the Soul: Persona", 
				"4 versions, photobook, sticker, minibook", "$18.00"));
    	System.out.println("BTS: " + BTS_albums);
    	BTS_albums.add(new BTS_Albums("BTS 2nd Album[Wings]", 
				"1 CD, photobook, photocard, poster", "$21.00"));
    	System.out.println("BTS: " + BTS_albums);
    	BTS_albums.add(new BTS_Albums("Love Yourself: Answer", 
				"2 CDs, photobook, photocard, poster", "$21.00"));
    	System.out.println("BTS: " + BTS_albums);
    	BTS_albums.add(new BTS_Albums("BTS 1st Album [Dark & Wild]", 
				"1 CD, 2 animation pictures, 2 photocards", "$18.00"));
    	System.out.println("BTS: " + BTS_albums);
    	BTS_albums.add(new BTS_Albums("You Never Walk Alone", 
				"1 CD, photobook, photocard, poster", "$23.00"));
    	System.out.println("BTS: " + BTS_albums);
	  }
	
	public void addApparel()
	{
    	//add Music
    	Apparel.add(new Apparel("10 pack white T-shirts", 
				"10 count, white 100% cotton T-shirts, size: L", "$15.00"));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("Parachute pants", 
				"Gold, parachute pants with elastic wasteband, fits most tetens and adults", "$18.00"));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("Nike Air Zoom Pegasus", 
				"cooling perforations, breathability across high-heat areas, reduce bulk without compromising comfort, Color: thunder gray", 
				"$120.00"));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("Balenciaga Platform Crocs", 
				"maximum shock absorbance, odor and water resistant, 15 cm platform, made in Wuhan", "$850.00"));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("Under Armour Hoodie", 
				"maximum comfort, air-jet yarn, 50% cotton 50% polyester", "$34.00"));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("Thigh-high Uggs", 
				"fashionable, wedge heel, 22'' shaft height, 2' heel height, water repellant", "$300.00"));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("Advanced Stretch Skinny Jeans", 
				"64% cotton 21% Modal 14% Lyocell 1% Elastane, dark wash denim, fading contrast stitching", "$25.00"));
    	System.out.println("Apparel: " + Apparel);
    	
	}
	
	public void addMusic()
	{
    	//add Music
    	Music.add(new Music("\"Circles\" by Post Malone", "Time: 3:35", "$1.29"));
    	System.out.println("Music: " + Music);
    	Music.add(new Music("\"Chills\" by Why Don't We", "Time: 2:45", "$1.29"));
    	System.out.println("Music: " + Music);
    	Music.add(new Music("\"When the Party's Over\" by Billie Eilish", "Time: 3:16", "$1.29"));
    	System.out.println("Music: " + Music);
    	Music.add(new Music("\"What Makes You Beautiful\" by One Direction", "Time: 3:19", "$1.29"));
    	System.out.println("Music: " + Music);
    	Music.add(new Music("\"Love Story\" by Taylor Swift", "Time: 3:55", "$1.29"));
    	System.out.println("Music: " + Music);
    	Music.add(new Music("\"Thank you, next\" by Ariana Grande", "Time: 3:27", "$1.29"));
    	System.out.println("Music: " + Music);
    	Music.add(new Music("\"Memories\" by Maroon 5", "Time: 3:09", "$1.29"));
    	System.out.println("Music: " + Music);
	}
	
	public void addElectronics()
	{
    	//add Music
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
	}
	
	public void addSnacks()
	{
    	//add Music
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
	}
	
	public void addOthers()
	{
    	//add Music
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
    	Apparel.add(new Apparel("", "", ""));
    	System.out.println("Apparel: " + Apparel);
	}
	
	public void removeproducts()
	  {
		  	// popping data off stack with console output
		  	for (int i = size; i >= 0; i--)
		  	{
				 System.out.println("Delete:" + BTS_albums.delete() + " " + BTS_albums);						
		  	}
	  }

	  /**
	   *  Display the top element of the list and full stack
	   */
	  public void displayQueue()
	  {
	    System.out.println("First Element: " + BTS_albums.getFirstObject() );
	    System.out.println("Last Element: " + BTS_albums.getLastObject() );
	    System.out.println("Complete Queue: " + BTS_albums);
	  }
	
	
	public static void main(String args[])
	{
		Categories BTS_albums = new Categories();

		BTS_albums.addBTS();
		BTS_albums.displayQueue();
		BTS_albums.removeproducts();
	}
}
