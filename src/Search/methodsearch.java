package Search;

import java.util.ArrayList;

import Linked_List.*;
import UI.mainUI;

public class methodsearch {
	private  boolean Found;
	private  ArrayList<String> Lines;   	//Each element of ArrayList contains a line from file
	private  ArrayList<String> Methods;	//methods matched will be added to methods ArrayList
	private  String Filenm;
	private  String SearchTerm;
	private  String Log;
	
	public methodsearch(ArrayList<CircleQueue> data)
    {
    	Found = true;
    	Lines = new ArrayList<String>();
        Methods = new ArrayList<String>();
        Log = "";
        
        
    }

	public void main() {
		
		
	}

}
