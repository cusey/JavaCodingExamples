package org.cusey.Collection;

import java.util.*;

public class MainCollection {
	
	//https://www.javatpoint.com/java-arraylist
	
	public static void main(String[] args) {
		
		
		System.out.println("***** Java ArrayList class *****");
		
		ArrayList<String> bandMembers =new ArrayList<String>();
		bandMembers.add("Tom"); 
		bandMembers.add("Jim");  
		bandMembers.add("Carl");  
		bandMembers.add("Bill");  
		
 
	   Iterator<String> itr = bandMembers.iterator();  
	   while(itr.hasNext()){  
	    System.out.println(itr.next());  
	   } 

		
	}

}
