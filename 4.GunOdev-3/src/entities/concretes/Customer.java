package entities.concretes;

import java.util.Date;

import entities.abstracts.Entity;

public class Customer implements Entity{
	private int id;
	private String citNumber;
	private String eMail;
	private String firstName;
	private String LastName;
	private Date dateOfBirth;
	private String customerNumber;
	public Customer(int id, String citNumber, String eMail, String firstName, String lastName, Date dateOfBirth,
			String customerNumber) {
		super();
		this.id = id;
		this.citNumber = citNumber;
		this.eMail = eMail;
		this.firstName = firstName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.customerNumber = customerNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCitNumber() {
		return citNumber;
	}
	public void setCitNumber(String citNumber) {
		this.citNumber = citNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	
}
