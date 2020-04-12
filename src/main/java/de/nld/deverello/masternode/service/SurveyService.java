package de.nld.deverello.masternode.service;

import de.nld.deverello.masternode.model.Survey;
import de.nld.deverello.masternode.repo.SurveyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private ModelMapper mapper;

    public Survey createSurvey(Survey surveyDTO) {
        return surveyRepository.save(surveyDTO);
    }

}
