package com.eventmgtsys.service;

import java.util.List;

import com.eventmgtsys.model.CompanyEntity;
import com.eventmgtsys.model.EventEntity;

public interface IEventService {
	List<EventEntity> getEvents();
	EventEntity getEventById(Long id);
    boolean addEvent(EventEntity event);
    void updateEvent(EventEntity event);
    void deleteEvent(Long id);
}
