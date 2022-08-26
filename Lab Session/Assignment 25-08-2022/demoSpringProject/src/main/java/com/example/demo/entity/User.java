package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Table(name="user")
@Entity
public class User {
	@Id
	private int id;
	@NotBlank(message="please enter your name")
	@Column(length=30,nullable=false)
	private String uName;
	@NotBlank(message="please enter your email")
	@Email
	@Column(length=30,nullable=false,unique=true)
	private String email;
	@Column(length=11,nullable=false,unique=true)
	private long userPhone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	
	

}
