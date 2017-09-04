package org.cusey.Generic;

public class MainGeneric {

    public static void main(String[] args) {

        System.out.println("*** GENERIC ***");

        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        Print.printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        Print.printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        Print.printArray(charArray);   // pass a Character array

    }
}
