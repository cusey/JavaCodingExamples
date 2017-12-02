package org.cusey.Lambda;

import java.util.*;
import java.util.function.*;

public class MainLambda {

		public static void main(String[] args) {
			

			
			System.out.println("***** LAMBDA EXPRESSION *****");
			
			System.out.println("-- Runnable Inner Class ");
			
			Runnable runAnonymous = new Runnable(){

				@Override
				public void run() {
					System.out.println("This is Anonymous Runnable class which is replaced by Lambda Expression !!");
				}
			};
			
			runAnonymous.run();

			System.out.println("-- Runnable Lambda ");
			Runnable runLambda = () -> { 
				                   			System.out.println("This is Runnable Lambda !"); 
				                       };
			
			runLambda.run();
			
			
			System.out.println("-- Sort Comparator Inner Class");
			
			List<Person> friends = People.createPeople();
			
			
			System.out.println("*** BEFORE SORT ***");
			People.printPeople(friends);

			Collections.sort(friends, 
			                 new Comparator<Person>(){public int compare(Person p1, Person p2){
			                                                     return p1.getLastName().compareTo(p2.getLastName());
			                                         }
			 });
			

			System.out.println("*** AFTER SORT ***");
			People.printPeople(friends);
			
			System.out.println("-- Sort Comparator Lambda");
			
			List<Person> closter = People.createPeople();
			
			System.out.println("*** BEFORE SORT ***");
			People.printPeople(closter);
			
			
			Collections.sort(closter, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
			
			System.out.println("*** AFTER SORT ***");
			People.printPeople(closter);
			
			System.out.println("-- Lambda Predicate Function");
			
		    Predicate<String> i  = (s)-> s.length() > 5;
		    
		    System.out.println("Using lambda predicates to see if TELEPHONE is long five character : RESULT " + i.test("TELEPHONE"));
		    System.out.println("Using lambda predicates to see if CAR is long five character  : RESULT " + i.test("CAR"));
		    
		    
		    //This is a functional interface and can therefore be used as the assignment target for a lambda expression or 
		    // method reference.
		    System.out.println("-- Lambda Comsumer Function");
		    Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		    
		    /*
		     * https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
		     * Method Detail of ACCEPT -  Performs this operation on the given argument.
		     */
		    c.accept("TRUCK");
			
			
			
		}

	}

