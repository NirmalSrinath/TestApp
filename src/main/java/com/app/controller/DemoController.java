/**
 * 
 */
package com.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.impl.UserImpl;
import com.app.model.User;

/**
 * @author Nirmal
 *
 */
@RestController("DemoController")
@RequestMapping(value="/api/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {
	@Autowired
	UserImpl userImpl;
	
	@GetMapping(value="/userId/{userId}")
	public List<User> userRegister(@PathVariable("userId") Integer userId){
		List<User> userDetails = userImpl.register(userId.toString());
		return userDetails;
		
	}

}
