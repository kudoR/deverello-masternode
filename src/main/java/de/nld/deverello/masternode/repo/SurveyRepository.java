package de.nld.deverello.masternode.repo;

import de.nld.deverello.masternode.model.Survey;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SurveyRepository extends MongoRepository<Survey, String> {
}