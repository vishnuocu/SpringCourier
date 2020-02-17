package com.eventmgtsys.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmgtsys.dao.ICompanyDao;
import com.eventmgtsys.dao.IEventDao;
import com.eventmgtsys.dao.IUserInfoDao;
import com.eventmgtsys.model.CompanyEntity;
import com.eventmgtsys.model.EventEntity;
import com.eventmgtsys.model.UserInfoEntity;


@Service
@Transactional
public class EventService implements IEventService {
	@Autowired
	private IEventDao eventDao;

	@Override
	public List<EventEntity> getEvents() {
		List<EventEntity> list=(List<EventEntity>) eventDao.findAll();
		return list;
	}
	@Override
	public EventEntity getEventById(Long id) {
		EventEntity eventEntity=eventDao.findOne(id);
		return eventEntity;
	}
	@Override
	public boolean addEvent(EventEntity event) {
		eventDao.save(event);
		return true;
	}
	@Override
	public void updateEvent(EventEntity event) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteEvent(Long id) {
		eventDao.delete(id);		
	}
}
