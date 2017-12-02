package org.cusey.Lambda;

import java.util.ArrayList;
import java.util.List;

public class  People {
	
	public static List<Person> createPeople(){
		
		List<Person> friends = new ArrayList<Person>();
		
		friends.add(new Person("Smith", "Tom", "tom_smith@yahoo.com", "2162041245", "M", 21, "514 5th avenue East Boston MA"));
		friends.add(new Person("Johnson", "Bob", "bob_johnson@yahoo.com", "2162041928", "M", 21, "Lake Street Boston MA"));
		friends.add(new Person("Wang", "Carl", "carl_wang@yahoo.com", "2162040890", "M", 21, "514 Rose Lane Boston MA"));
		friends.add(new Person("Hernandez", "Joe", "joe_sHernandez@yahoo.com", "2162041245", "M", 21, "208 9th West Boston MA"));
		
		return friends;
	}
	
	public static void printPeople(List<Person> friends){
	
		for (Person elements : friends) {
			System.out.println(elements.toString());
		}
		
	}
	
	
	
	

}
