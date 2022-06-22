package tn.esprit.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.User;

@Service
public interface IUserService { 
	 
	List<User> retrieveAllUsers(); 
	User addUser(User u);
	void deleteUser(String id);
	User updateUser(User u);
	User retrieveUser(String id);

} 
 