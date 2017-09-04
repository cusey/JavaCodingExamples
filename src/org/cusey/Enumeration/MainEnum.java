package org.cusey.Enumeration;

public class MainEnum {

    public static void main(String[] args) {
        System.out.println("*** ENUMERATION ***");

        System.out.println("Abbreviate for " + PartOfSpeech.ADJECTIVE +" is : " +PartOfSpeech.ADJECTIVE.abbreviate());

        PartOfSpeech pos = PartOfSpeech.NOUN;

        switch (pos) {
            case NOUN:
                System.out.println(PartOfSpeech.NOUN);
                break;
            case PRONOUN:
                System.out.println(PartOfSpeech.PRONOUN);
                break;
            default:
                throw new AssertionError("Unknown pos " + pos);

        }


    }


}
