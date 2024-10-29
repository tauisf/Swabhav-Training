package com.aurionpro.model;

import java.util.ArrayList;

import java.util.List;

public class User {

	private int userId;
	private String firstName;
	private String lastName;
	private List<Contact> contacts;
	
	
	
	public User(int userId, String firstName, String lastName, boolean isActive) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isActive = isActive;
        this.contacts = new ArrayList<>(); 
	}
	private boolean isActive;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	} 
	
	
	
	@Override
    public String toString() {
        return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + 
               ", contacts=" + contacts + ", isActive=" + isActive + "]";
    }
	
	
	
}
