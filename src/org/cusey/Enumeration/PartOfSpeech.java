package org.cusey.Enumeration;

public enum PartOfSpeech {

    NOUN("n."),
    PRONOUN("p."),
    VERB("v."),
    ADVERB("adv."),
    ADJECTIVE("adj."),
    CONJECTION("conj."),
    PREPOSITION("pre."),
    INTERJECTION("int.");

    private String abbreviate;

    PartOfSpeech(String abbreviate) {
        this.abbreviate = abbreviate;
    }

    public String abbreviate() {
        return abbreviate;
    }
}
