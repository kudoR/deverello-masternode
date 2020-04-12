package de.nld.deverello.masternode.model;

import java.util.Objects;

public class SurveyItem {

    private Long id;

    private Survey survey;

    private String content;

    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SurveyItem{" +
                "id=" + id +
                ", survey=" + survey +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurveyItem that = (SurveyItem) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(survey, that.survey) &&
                Objects.equals(content, that.content) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, survey, content, type);
    }
}
