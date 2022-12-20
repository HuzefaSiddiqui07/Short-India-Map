package com.collectionframeworks.map.setmap.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class IndiaMap {

	public static void main(String[] args) {
		
		
	    ArrayList<String> maharashtra = new ArrayList<String>();
	    
	    maharashtra.add("Pune");
	    maharashtra.add("Mumbai");
	    maharashtra.add("Nashik");
	    
	    ArrayList<String> rajasthan = new ArrayList<String>();
	    
	    rajasthan.add("Jaipur");
	    rajasthan.add("Udaipur");
	    rajasthan.add("Ajmer");
	    
	    ArrayList<String> punjab = new ArrayList<String>();
	    
	    punjab.add("Amritsar");
	    punjab.add("Ludhiana");
	    punjab.add("Patiala");
	    
	    LinkedHashMap<String , ArrayList<String>> lhmState = new  LinkedHashMap<String , ArrayList<String>>();
	    
	    lhmState.put("MH", maharashtra);
	    lhmState.put("RJ", rajasthan);
	    lhmState.put("PB", punjab);
	    
	    HashMap<String , LinkedHashMap<String , ArrayList<String>>> hmCountry = new HashMap<String , LinkedHashMap<String , ArrayList<String>>>();
	    
	    hmCountry.put("India" , lhmState);
	    
	   //  System.out.println(hmCountry);
	    
	    Set<String> s = hmCountry.keySet();
	    
//	    for(String d : s) {
//	    	System.out.println("Key >>> " + d);
//	    	System.out.println("Value >>> " + hmCountry.get(d));
//	    }
	    
	    Iterator<String> itr = s.iterator();
	    while(itr.hasNext()) {
	    	String n = itr.next();
	    	System.out.println("Key >>> " + n);
	    	System.out.println("Value >>> " + hmCountry.get(n));
	    }
	}
 }
