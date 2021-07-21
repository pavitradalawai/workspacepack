package com.workz.places;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PlacesTester {

	public static void main(String[] args) {

		String place1 = "Mysore";
		String place2 = "Banglore";
		String place3 = "Hasana";
		String place4 = "Mandya";
		String place5 = "Kerala";
		String place6 = "Chikkamagaloru";
		String place7 = "Rayachuru";
		String place8 = "Gadaga";
		String place9 = "Hubbali";
		String place10 = "Dharwad";

		Collection collection = new ArrayList(10);
		boolean added = false;
		added = collection.add(place2);
		added = collection.add(place4);
		added = collection.add(place5);
		added = collection.add(place6);
		added = collection.add(place3);
		added = collection.add(place7);
		added = collection.add(place8);
		added = collection.add(place9);
		added = collection.add(place1);
		added = collection.add(place10);
		added = collection.add("Karvar");
		System.out.println(added);
		System.out.println(collection);
		
		int total = collection.size();
		System.out.println("total no"+total);
		String check="Karvar";
		boolean contain=collection.contains(check);
		System.out.println("contain check"+contain);
	    System.out.println("removed place3"+collection.remove(place3));
	    boolean removed=collection.remove("Hasana");
		System.out.println("removed Hasana "+removed );
	     Iterator iterator= collection.iterator();
	     
	    
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     System.out.println(iterator.hasNext());
	     
         System.out.println(collection);
         collection.clear();
         System.out.println(collection);
        
		System.out.println("size" + collection.size());
	}
}
