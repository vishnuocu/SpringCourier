package com.eventmgtsys.model;

import java.util.Date;

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
@Table(name= "event")  
public class EventEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private Long eventId;  
	private String eventName;
	private String phoneNumber;
	private String emailId;
	private String eventDate;
	private String eventTime;
	private String venue;
	private String totalExpectedGuests;
	private String tableSize;
	private String noOfseatsAvailable;
	private String eventPlanner;
	private String customerName;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTotalExpectedGuests() {
		return totalExpectedGuests;
	}
	public void setTotalExpectedGuests(String totalExpectedGuests) {
		this.totalExpectedGuests = totalExpectedGuests;
	}
	public String getTableSize() {
		return tableSize;
	}
	public void setTableSize(String tableSize) {
		this.tableSize = tableSize;
	}
	public String getNoOfseatsAvailable() {
		return noOfseatsAvailable;
	}
	public void setNoOfseatsAvailable(String noOfseatsAvailable) {
		this.noOfseatsAvailable = noOfseatsAvailable;
	}
	public String getEventPlanner() {
		return eventPlanner;
	}
	public void setEventPlanner(String eventPlanner) {
		this.eventPlanner = eventPlanner;
	}
}
