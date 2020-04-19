package de.nld.deverello.masternode.controller;

import de.nld.deverello.masternode.model.Survey;
import de.nld.deverello.masternode.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    private SurveyService service;

    @PostMapping(produces = "application/json")
    public ResponseEntity<?> createSurvey(@RequestBody Survey survey, HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        survey.setRemoteAddr(remoteAddr);
        Survey createdSurvey = service.createSurvey(survey);
        return new ResponseEntity<>(createdSurvey, HttpStatus.CREATED);
    }

}
