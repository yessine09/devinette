package tn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entity.User;
import tn.spring.repository.UserRepo;



@Service
public class UserService implements IUser {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public List<User> retrieveAllUsers() {
		// TODO Auto-generated method stub
		List<User> users =  userRepo.findAll();
		return users;
		
	}

	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User retrieveUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	

	}
