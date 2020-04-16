package de.nld.deverello.masternode.service;

import de.nld.deverello.masternode.model.Survey;
import de.nld.deverello.masternode.repo.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public Survey createSurvey(Survey survey) {
        String path = String.format("/%s/%s/%s", survey.getCategory(), survey.getSubtag().getTag().getName(), survey.getSubtag().getName());
        survey.setPath(path);
        survey.setDateTime(LocalDateTime.now().toString());
        return surveyRepository.save(survey);
    }

}
