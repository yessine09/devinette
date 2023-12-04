package tn.spring.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.spring.entity.User;
import tn.spring.service.IUser;



@RestController
public class UserControlleur {
	
	@Autowired
	IUser userService;
	// // http://localhost:8088/SpringMVC/servlet/retrieve-all-clients
	
		@GetMapping("/retrieve-all-users")
		
		@ResponseBody
		public List<User> getUser(){
			List<User> listUsers = userService.retrieveAllUsers();
			return listUsers;
		}
	
		
		
		

}
