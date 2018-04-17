/**
 * 
 */
package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Nirmal
 *
 */
@Entity
@Table(name="USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USERID")
	private Integer userId;
	@Column(name="USERNAME")
	private String userName;
	@Column(name="ADDRES")
	private String addres;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="USERID", referencedColumnName="USER_ID")
	private UserDetails userDetails;
	
	public User(){}
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public User(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	
}
