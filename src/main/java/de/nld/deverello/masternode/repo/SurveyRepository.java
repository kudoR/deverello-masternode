package de.nld.deverello.masternode.repo;

import de.nld.deverello.masternode.model.Survey;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SurveyRepository extends MongoRepository<Survey, String> {
    List<Survey> findByActiveIsTrue();
}