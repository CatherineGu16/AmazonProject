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
    	Apparel.add(new Music("Map of the Soul: 7", 
				"4 versions, photobook, lyric book, minibook, postcard, sticker, poster", "$25.00"));
    	System.out.println("BTS: " + BTS_albums);
    	
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

		BTS_albums.addproducts();
		BTS_albums.displayQueue();
		BTS_albums.removeproducts();
	}
}
