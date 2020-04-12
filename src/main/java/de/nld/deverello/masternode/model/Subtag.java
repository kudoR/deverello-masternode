package de.nld.deverello.masternode.model;

public class Subtag extends SurveyRelated {

    private Tag tag;

    public Subtag() {
    }

    public Subtag(String name) {
        super(name);
    }

    public Subtag(String name, String displayName, String logoUrl) {
        super(name, displayName, logoUrl);
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
