package org.cusey.Overriding;

public class MainOverriding {

    public static void main(String[] args) {

        System.out.println("*** OVERRIDING ***");

        Animal dog =new Dog(); // Animal reference but Dog object
        dog.move();   // runs the method in Dog class

    }
}
