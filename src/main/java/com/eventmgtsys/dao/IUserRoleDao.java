package com.eventmgtsys.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eventmgtsys.model.UserInfoEntity;
import com.eventmgtsys.model.UserRolesEntity;


	@Transactional
	@Repository
	public interface IUserRoleDao extends CrudRepository<UserRolesEntity, Long>
	{
		
	}
