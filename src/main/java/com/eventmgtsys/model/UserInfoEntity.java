package com.eventmgtsys.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity  
@Table(name= "user_info")  
public class UserInfoEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private Long userInfoId;  
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private String phoneNumber;
	@Column(unique=true)
	private String username;
	@NotNull
	private String pwd;
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "roleId", referencedColumnName = "roleId", nullable = false)
	private UserRolesEntity userRolesEntity;

public Long getUserInfoId() {
	return userInfoId;
}
public void setUserInfoId(Long userInfoId) {
	this.userInfoId = userInfoId;
}
public UserRolesEntity getUserRolesEntity() {
	return userRolesEntity;
}
public void setUserRolesEntity(UserRolesEntity userRolesEntity) {
	this.userRolesEntity = userRolesEntity;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
}
