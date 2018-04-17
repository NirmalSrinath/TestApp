/**
 * 
 */
package com.app.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repo.UserRepository;

/**
 * @author Nirmal
 *
 */
@Service
public class UserDao {

	@Autowired
	UserRepository userRepo;
	
	public User userRegister(User user){
		User users = userRepo.save(user);
		return users;
		
	}
	public List<User> getAll(){
		List<User> users = userRepo.findAll();
		return users;
		
	}
}
