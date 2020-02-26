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
	
	public void addSnacks()
	{
    	//add Music
    	Snacks.add(new Snacks("Catherine's chips", "Bestest chips ever, sponsored by Sravani", "$5.00"));
    	System.out.println("Snacks: " + Snacks);
    	Snacks.add(new Snacks("Chocolate chip cookies", "Pack of 20 cookies", "$6.00"));
    	System.out.println("Snacks: " + Snacks);
    	Snacks.add(new Snacks("Flamin' Hot Cheetos", "Made with real cheese", "$3.00"));
    	System.out.println("Snacks: " + Snacks);
    	Snacks.add(new Snacks("Orville Redenbacher's Ultra Butter Microwave Popcorn", "6 packs of 3.96 oz. popcorn", "$20.88"));
    	System.out.println("Snacks: " + Snacks);
    	Snacks.add(new Snacks("Haribo Gummy Bears", "5 lb, approximately 985 pieces, America's #1 selling gummy bear", "$12.79"));
    	System.out.println("Snacks: " + Snacks);
    	Snacks.add(new Snacks("Pepperidge Farm Xtra Cheddar Goldfish", 
				"Playful cheese crackers baked with a smile, no artificial colors or preservatives", "3.64"));
    	System.out.println("Snacks: " + Snacks);
    	Snacks.add(new Snacks("Nature Valley Granola Bars", "total 36 bars, made with real ingredients, wholesome snack bar", "17.52"));
    	System.out.println("Snacks: " + Snacks);
	}
	
	public void addElectronics()
	{
    	//add Music
    	Electronics.add(new Electronics("Dell-Inspiron 15.6''", "Touchscreen, Intel Core i5, 8GB Memory, color: black", "$500.00"));
    	System.out.println("Electronics: " + Electronics);
    	Electronics.add(new Electronics("13-inch Macbook Pro", "1.4GHz Quad-Core Processor, touchbar, touch ID, 256 GB", "$1499.00"));
    	System.out.println("Electronics: " + Electronics);
    	Electronics.add(new Electronics("iPhone 11 Pro Max", "Triple-camera system, 256 GB, Color: Space Gray", "$1249.00"));
    	System.out.println("Electronics: " + Electronics);
    	Electronics.add(new Electronics("12.9 inch iPad Pro", 
				"Liquid retina display, 12-megapixel camera, true tone display, 256 GB, color: silver", "$1149.00"));
    	System.out.println("Electronics: " + Electronics);
    	Electronics.add(new Electronics("50-inch Samsung Smart 4K Ultra HD TV", "2 HDMI ports, Pur Color, connect & share", "$300.00"));
    	System.out.println("Electronics: " + Electronics);
    	Electronics.add(new Electronics("Apple Watch Series 5", 
				"Always-On retina display, Ultra-low power LTPO display, all-day battery life", "$400.00"));
    	System.out.println("Electronics: " + Electronics);
	}
	
	public void addOther()
	{
    	//add Music
    	Other.add(new Other("Pop socket", 
				"multi-colored graphic with glossy finish, offers secure grip on phone", "$8.00"));
    	System.out.println("Other: " + Other);
    	Other.add(new Other("Otterbox Symmetry Case", 
				"synthetic rubber, ultra thin, raised bumper", "$45.00"));
    	System.out.println("Other: " + Other);
    	Other.add(new Other("Penn Pro Tennis Balls", 
				"longest lasting tennis balls, LongPlay felt", "$80.00"));
    	System.out.println("Other: " + Other);
    	Other.add(new Other("Papermate Clearpoint Mechanical Pencils", 
				"0.05 mm, convenient click, twist eraser, comfort grip", "$5.00"));
    	System.out.println("Other: " + Other);
    	Other.add(new Other("Diamond and Blue Sapphire Halo Necklace", 
				"New 28.9 ctw diamond, gold, and sapphire", "$45950"));
    	System.out.println("Other: " + Other);
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
