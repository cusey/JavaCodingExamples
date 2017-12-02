package org.cusey.Collection;

import java.util.*;

public class MainCollection {
	
	//https://www.javatpoint.com/java-arraylist
	
	public static void main(String[] args) {
		
		
		System.out.println("***** List *****");
		
		ArrayList<String> bandMembers =new ArrayList<String>();
		bandMembers.add("Tom"); 
		bandMembers.add("Jim");  
		bandMembers.add("Carl");  
		bandMembers.add("Bill");  
		
 
	   Iterator<String> itr = bandMembers.iterator();  
	   while(itr.hasNext()){  
	    System.out.println(itr.next());  
	   }

		System.out.println("***** Map *****");


		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		
	}

}
