/**
 * 
 */
package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.UserDetails;

/**
 * @author Nirmal
 *
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>{

}
