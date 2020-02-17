package com.eventmgtsys.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmgtsys.dao.IUserInfoDao;
import com.eventmgtsys.dao.IUserRoleDao;
import com.eventmgtsys.model.UserInfoEntity;
import com.eventmgtsys.model.UserRolesEntity;


@Service
@Transactional
public class UserRolesService implements IUserRolesService {
	@Autowired
	private IUserRoleDao userRoleDAO;
	@Override

	public List<UserRolesEntity> getAllRoles() {
		// TODO Auto-generated method stub
		return (List<UserRolesEntity>) userRoleDAO.findAll();
	}
	@Override
	public UserRolesEntity getRolesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean addRole(UserRolesEntity userInfo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateUserRole(UserRolesEntity userInfo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteUserRole(int id) {
		// TODO Auto-generated method stub
		
	}
}
