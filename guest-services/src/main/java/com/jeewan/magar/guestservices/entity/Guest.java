package com.jeewan.magar.guestservices.entity;
import javax.persistence.*;

@Entity
@Table(name="GUEST")
public class Guest {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="GUEST_ID")
 private long id;
 @Column(name="FIRST_NAME")
 private String firstname;
 
 @Column(name="LAST_NAME")
 private String lastname;
 
 @Column(name="EMAIL_ADDRESS")
 private String emailAddress;
 
 @Column(name="ADDRESS")
 private String address;
 
 @Column(name="COUNTRY")
 private String country;
 
 @Column(name="STATE")
 private String state;
 
 @Column(name="PHONE_NUMBER")
 private String phoneNumber;
 
 
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
 
 
 

}
