package com.eventmgtsys.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eventmgtsys.model.UserInfoEntity;




@Transactional
@Repository
public interface IUserInfoDao extends CrudRepository<UserInfoEntity, Long>
{
	
}
