package de.nld.deverello.masternode.controller;

import de.nld.deverello.masternode.model.Survey;
import de.nld.deverello.masternode.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    @GetMapping
    public ResponseEntity<?> getActiveSurveys() {
        List<Survey> activeSurveys = service.getActiveSurveys();
        return new ResponseEntity<>(activeSurveys, HttpStatus.OK);
    }

}
