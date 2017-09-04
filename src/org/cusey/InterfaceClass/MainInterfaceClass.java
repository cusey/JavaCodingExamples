package org.cusey.InterfaceClass;

public class MainInterfaceClass {

    public static void main(String[] args) {

        System.out.println("*** INTERFACE CLASS ***");

        //Pattern pattern = new Pattern(); // An interface class cannot be instantiated.

        Customers initial = new Customers("Tom","Smith");

        System.out.println("--- Copy ---");
        Customers copy = initial.copy();

        System.out.println("-- Before Copy (initial) " + initial.toString());
        System.out.println("-- Before Copy (copy) " + copy.toString());

        copy.setFirst_name("Bill");
        copy.setLast_name("Jones");


        System.out.println("-- After Copy (initial) " + initial.toString());
        System.out.println("-- After Copy (copy)" + copy.toString());

        System.out.println("--- Clone---");
        Customers clone = initial.clone();

        System.out.println("-- Before Copy (initial) " + initial.toString());
        System.out.println("-- Before Copy (clone) " + clone.toString());

        clone.setFirst_name("John");
        clone.setLast_name("Peterson");

        System.out.println("-- After Copy (initial) " + initial.toString());
        System.out.println("-- After Copy (clone)" + clone.toString());

    }

}
