package com.eventmgtsys.service;

import java.util.List;

import com.eventmgtsys.model.UserRolesEntity;

public interface IUserRolesService {
	List<UserRolesEntity> getAllRoles();
	UserRolesEntity getRolesById(int id);
    boolean addRole(UserRolesEntity userInfo);
    void updateUserRole(UserRolesEntity userInfo);
    void deleteUserRole(int id);
}
