package com.eventmgtsys.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity  
@Table(name= "user_roles")  
public class UserRolesEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;

public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
