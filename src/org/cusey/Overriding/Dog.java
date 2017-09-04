package org.cusey.Overriding;

public class Dog extends Animal {
	
	   public Dog(){
		   
	   }
	   
	   
	   public void move() {
	      super.move();   // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }
	}
