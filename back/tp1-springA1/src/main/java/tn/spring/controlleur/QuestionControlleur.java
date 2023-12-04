package tn.spring.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.spring.entity.Question;
import tn.spring.service.IQuestion;



@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")

public class QuestionControlleur {
	
	@Autowired
	IQuestion questionService;
	// // http://localhost:8088/SpringMVC/servlet/retrieve-all-clients

		@GetMapping("/retrieve-all-questions")
		
		@ResponseBody
		public List<Question> getQuestions(){
			List<Question> listQuestions = questionService.retrieveAllQuestions();
			return listQuestions;
		}
	
		//recupérer selon l'id
		// http://localhost:8089/SpringMVC/client/retrieve-client/8
		@GetMapping("/retrieve-question/{question-id}")
		@ResponseBody
		public Question retriveQuestion(@PathVariable("question-id")Long questionId) {
			return questionService.retrieveQuestion(questionId);
			}
		
		 @GetMapping("/check-response")
		    public ResponseEntity<Boolean> checkResponse(@RequestParam("questionId") Long questionId, @RequestParam("reponse") String reponse) {
		        boolean isResponseCorrect = questionService.checkResponse(questionId, reponse);
		        return ResponseEntity.ok(isResponseCorrect);
		    }
		
		
		

}
