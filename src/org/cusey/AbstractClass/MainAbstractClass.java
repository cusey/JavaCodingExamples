package org.cusey.AbstractClass;

public class MainAbstractClass {

    public static void main(String[] args) {
        System.out.println("*** ABSTRACT CLASS ***");

        //Shape shape = new Shape(); // An abstract class cannot be instantiated.

        Square square = new Square( 8, 9);

        square.setColor( "green" );

        //Prints object property
        System.out.println("Square = " + square.toString() );

        System.out.println("Square Area = " + square.area() );

        System.out.println("Square Perimeter = " + square.perimeter() );

    }

}

