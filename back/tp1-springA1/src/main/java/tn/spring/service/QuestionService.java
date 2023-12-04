package tn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entity.Question;
import tn.spring.repository.QuestionRepo;

@Service
public class QuestionService implements IQuestion {
	
	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public List<Question> retrieveAllQuestions() {
		List<Question> questions =  questionRepo.findAll();
		return questions;
	}

	@Override
	public Question addQuestion(Question q) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteQuestion(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Question updateQuestion(Question q) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question retrieveQuestion(Long id) {
		Question question = questionRepo.findById(id).orElse(null);
		return question;
	}

	@Override
	public boolean checkResponse(Long questionId, String reponse) {
        return questionRepo.existsByQuestionIdAndReponse(questionId, reponse);

	}

	
	


}
