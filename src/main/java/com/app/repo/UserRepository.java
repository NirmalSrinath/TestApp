/**
 * 
 */
package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.model.User;

/**
 * @author Nirmal
 *
 */
@Service
public interface UserRepository extends JpaRepository<User, Integer>{
	

}
