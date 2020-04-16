package de.nld.deverello.masternode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class SurveyBase {

    @Id
    private String id;

    private Type type;

    private SurveyItem question;

    private SurveyItem additionalQuestion;

    private List<SurveyItem> possibleAnswers = new ArrayList<>();

    private List<SurveyItem> correctAnswers = new ArrayList<>();

    private Set<Tag> tags = new HashSet<>();

    private Subtag subtag;

    private Jobrole jobrole;

    private Set<Company> companies = new HashSet<>();

    private Category category;

    private boolean active;

    private Long durationInSeconds;

    public SurveyBase() {
        this.type = Type.CODE;
    }

}
