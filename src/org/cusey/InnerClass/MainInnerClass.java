package org.cusey.InnerClass;

class OuterClass{
	// inner class
	   private class InnerClass {
	      public void print() {
	         System.out.println("This is an inner class");
	      }
	   }
	   
	   // Accessing he inner class from the method within
	   void displayInner() {
		   InnerClass inner = new InnerClass();
	       inner.print();
	   }
}

public class MainInnerClass {

	  public static void main(String args[]) {
	      // Instantiating the outer class 
		  OuterClass outer = new OuterClass();
	      
	      // Accessing the display_Inner() method.
	      outer.displayInner();
	   }

}
