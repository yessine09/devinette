package tn.spring.service;

import java.util.List;

import tn.spring.entity.Question;

public interface IQuestion {
	List<Question> retrieveAllQuestions();

	Question addQuestion(Question q);

	void deleteQuestion(Long id);

	Question updateQuestion(Question q);

	Question retrieveQuestion (Long id);
	
    boolean checkResponse(Long questionId, String reponse);
	

}
