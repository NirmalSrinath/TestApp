/**
 * 
 */
package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nirmal
 *
 */
@Entity
@Table(name="USERDETAILS")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USERDETAILID")
	private Integer userDetailID;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="PHONENUMBER")
	private Integer phoneNumber;
	@Column(name="USER_ID")
	private Integer user_Id;

	public Integer getUserDetailID() {
		return userDetailID;
	}

	public void setUserDetailID(Integer userDetailID) {
		this.userDetailID = userDetailID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Integer user_Id) {
		this.user_Id = user_Id;
	}
	
	
	

}
