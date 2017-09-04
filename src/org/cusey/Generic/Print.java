package org.cusey.Generic;

public class Print {
	
	 public static < E > void printArray( E[] inputArray ) {
	      for(E element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	 }

}
