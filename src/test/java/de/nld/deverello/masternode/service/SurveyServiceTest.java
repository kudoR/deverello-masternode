package de.nld.deverello.masternode.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.nld.deverello.masternode.model.Subtag;
import de.nld.deverello.masternode.model.Survey;
import de.nld.deverello.masternode.model.SurveyItem;
import de.nld.deverello.masternode.model.Tag;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.List;
import java.util.Set;

import static de.nld.deverello.masternode.model.Category.PROGRAMMIERSPRACHE;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SurveyServiceTest {

    @Autowired
    private SurveyService service;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateSurveyApi() throws JsonProcessingException {
        String survey = json(create());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request =
                new HttpEntity<>(survey, headers);
        this.restTemplate.postForObject("http://localhost:" + port + "/survey", request, String.class);
    }

    private String json(Object o) throws JsonProcessingException {
        return objectMapper.writeValueAsString(o);
    }

    @Test
    @Ignore
    public void testCreateSurvey() {
        Survey survey = create();
        service.createSurvey(survey);
    }

    private Survey create() {
        Survey survey = new Survey();
        survey.setTags(tags());
        survey.setSubtag(subtag());
        survey.setCategory(PROGRAMMIERSPRACHE);
        survey.setQuestion(surveyItem("Wer war zuerst da, die Henne, oder das Ei?"));
        survey.setPossibleAnswers(possibleAnswers());
        survey.setCorrectAnswers(correctAnswers());
        return survey;
    }

    private List<SurveyItem> correctAnswers() {
        return List.of(surveyItem("Antwort 1"));
    }

    private List<SurveyItem> possibleAnswers() {
        return List.of(surveyItem("Antwort 1"), surveyItem("Antwort 2"));
    }

    private SurveyItem surveyItem(String content) {
        SurveyItem surveyItem = new SurveyItem();
        surveyItem.setContent(content);
        return surveyItem;
    }

    private Subtag subtag() {
        Subtag subtag = new Subtag();
        subtag.setName("Subtag1");
        subtag.setDisplayName("Subtag 1");
        return subtag;
    }

    private Set<Tag> tags() {
        Tag tag = new Tag();
        tag.setName("Tag1");
        tag.setDisplayName("Tag 1");
        tag.setCategory(PROGRAMMIERSPRACHE);
        return Set.of(tag);
    }

}