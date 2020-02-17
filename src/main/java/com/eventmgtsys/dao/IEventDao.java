package com.eventmgtsys.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.eventmgtsys.model.EventEntity;
@Transactional
@Repository
public interface IEventDao extends CrudRepository<EventEntity, Long>
{
	
}
