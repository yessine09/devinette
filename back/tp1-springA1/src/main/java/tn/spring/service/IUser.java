package tn.spring.service;

import java.util.List;

import tn.spring.entity.User;

public interface IUser {
	List<User> retrieveAllUsers();

	User addUser(User u);

	void deleteUser(Long id);

	User updateUser(User u);

	User retrieveUser(Long id);
	

}
