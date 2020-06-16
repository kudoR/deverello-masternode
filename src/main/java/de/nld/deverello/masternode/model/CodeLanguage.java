package de.nld.deverello.masternode.model;

public enum CodeLanguage {

    JAVA("Java"), JAVASCRIPT("JavaScript"), PHP("PHP"), NONE("none");

    private String name;

    CodeLanguage(String name) {
        this.name = name;
    }

}
