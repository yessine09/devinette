package tn.spring.repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.spring.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {
	  @Query("SELECT CASE WHEN COUNT(q) > 0 THEN true ELSE false END FROM Question q WHERE q.id = :questionId AND q.reponse = :response")
	    boolean existsByQuestionIdAndReponse(@Param("questionId") Long questionId, @Param("response") String response);
	}
	
