package tn.spring.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idQuestion;
	private String reponse;
	private String contenu;
	
	@ManyToMany(mappedBy="questions", cascade = CascadeType.ALL) 
			private Set<User> users;

	
	

	
}
