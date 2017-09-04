package org.cusey.ModifierTypes;

import org.cusey.ModifierTypes.Default.Car;
import org.cusey.ModifierTypes.Protected.Van;

public class MainModifierTypes {

    public static void main(String[] args) {


        System.out.println("*** MODIFIER TYPES ***");

        System.out.println("--- Java Access Modifiers (Default) ---");

        Car car = new Car();
        car.printTruckName();

        System.out.println("--- Java Access Modifiers (Protected) ---");

        Van van = new Van();
        van.printTruckModel();



    }
}
