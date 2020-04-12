package de.nld.deverello.masternode.model;

public class SurveyRelated {

    private Long id;

    private String name;

    private String displayName;

    private String logoUrl;

    public SurveyRelated() {
    }

    public SurveyRelated(String name) {
        this.name = name;
    }

    public SurveyRelated(String name, String displayName, String logoUrl) {
        this.name = name;
        this.displayName = displayName;
        this.logoUrl = logoUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
