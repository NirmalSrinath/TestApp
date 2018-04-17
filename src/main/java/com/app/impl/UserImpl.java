/**
 * 
 */
package com.app.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dao.UserDao;
import com.app.model.User;
import com.app.model.UserDetails;

/**
 * @author Nirmal
 *
 */
@Service
public class UserImpl {

	@Autowired
	UserDao userDao;
	
	public List<User> register(String userDetail){
		User user = new User();
		user.setUserName("nirmal");
		UserDetails userDetails = new UserDetails();
		userDetails.setAddress("north street");
		userDetails.setPhoneNumber(801248);
		//user.setUserDetails(userDetails);
		User users = userDao.userRegister(user);
		if(users!=null)
		System.out.println(users);	
		return userDao.getAll();
		
	}
}
