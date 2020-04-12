package de.nld.deverello.masternode.model;

public class Company extends SurveyRelated {

    public Company() {
    }

    public Company(String name) {
        super(name);
    }

    public Company(String name, String displayName, String logoUrl) {
        super(name, displayName, logoUrl);
    }
}
