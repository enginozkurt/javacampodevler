package Kodlama;

public class User {
	int id;
	String name;
	String surname;
	String citizenNumber;
	String email;
	String phoneNumber;
	public User(int id, String name, String surname, String citizenNumber, String email, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.citizenNumber = citizenNumber;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCitizenNumber() {
		return citizenNumber;
	}
	public void setCitizenNumber(String citizenNumber) {
		this.citizenNumber = citizenNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
