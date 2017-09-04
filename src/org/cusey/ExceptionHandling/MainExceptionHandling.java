package org.cusey.ExceptionHandling;

public class MainExceptionHandling {

    public static void main(String[] args) {
        System.out.println("*** EXCEPTION HANDLING ***");

        Math math = new Math();

        try{

            double result = math.divide(1, 1);

            System.out.println("Result : " + result);

        }catch(DivideByZeroException error){
            System.out.println(error.getMessage() );
        }



        try{

            double result = math.divide(1, 0);

            System.out.println("Result : " + result);

        }catch(DivideByZeroException error){
            System.out.println(error.getMessage() );
        }

    }
}
