package de.nld.deverello.masternode.model;

public class Tag extends SurveyRelated {

    private Category category;

    public Tag() {
    }

    public Tag(String name) {
        super(name);
    }

    public Tag(String name, String displayName, String logoUrl) {
        super(name, displayName, logoUrl);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
