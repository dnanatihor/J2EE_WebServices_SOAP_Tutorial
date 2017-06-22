package com.rohit.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3817342499996485466L;
	
	
	private String id;
	@XmlElement( required = true, nillable = false )
	private String firstName;
	@XmlElement( required = true, nillable = false )
	private String lastName;
	@XmlElement( required = true, nillable = false )
	private String desgination;
	@XmlElement( required = true, nillable = false )
	private String role;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
