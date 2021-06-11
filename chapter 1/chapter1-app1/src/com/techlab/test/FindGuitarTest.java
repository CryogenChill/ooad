package com.techlab.test;

import com.techlab.model.Guitar;
import com.techlab.model.Inventory;

public class FindGuitarTest {

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Inventory inventory = new Inventory();
	    initializeInventory(inventory);

	    Guitar whatErinLikes = new Guitar("", 0, "Fender", "Stratocastor", 
	                                      "electric", "Alder", "Alder");
	    Guitar guitar = inventory.search(whatErinLikes);
	    if (guitar != null) {
	      System.out.println("Erin, you might like this " +
	        guitar.getBuilder() + " " + guitar.getModel() +  " " +
	        guitar.getType() + " guitar:\n   " +
	        guitar.getBackWood() + " back and sides,\n   " +
	        guitar.getTopWood() + " top.\nYou can have it for only $" +
	        guitar.getPrice() + "!");
	    } else {
	      System.out.println("Sorry, Erin, we have nothing for you.");
	    }
	  }

	  private static void initializeInventory(Inventory inventory) {
	    inventory.addGuitar("V95693", 1499, "Fender", "Stratocastor", "electric",
	                        "Alder", "Alder");
	    inventory.addGuitar("V9512", 1549, "Fender", "Stratocastor", "electric",
	                        "Alder", "Alder");
	    inventory.addGuitar("122784", 5499, "Martin", "D-18", "acoustic",
	                        "Mahogany", "Adirondack");
	    inventory.addGuitar("70108276", 2299, "Gibson", "Les Paul", "electric",
	                        "Mahogany", "Maple");
	    inventory.addGuitar("82765501", 1899, "Gibson", "SG '61 Reissue",
	                        "electric", "Mahogany", "Mahogany");
	    inventory.addGuitar("629584", 2100, "PRS", "Dave Navarro Signature",
	                        "electric", "Mahogany", "Maple");
	  }
	}
