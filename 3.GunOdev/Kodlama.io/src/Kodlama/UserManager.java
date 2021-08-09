package Kodlama;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println("User Added ...");
	}
	
	public void addUser(Instructor instructor) {
		System.out.println("Instructer Added ...");
	}
	
	
	public void addUser(Student student) {
		System.out.println("Student added ...");
	}
	
	public void getUser(User user) {
		System.out.println("user : " + user.name + " " + user.surname + "\nCitizen Number :"+ user.citizenNumber);
	}
	
	public void getUser(Instructor user) {
		System.out.println("user : " + user.name + " " + user.surname + "\nPersonel Code :"+ user.personelCode);
	}
	
	public void getUser(Student user) {
		System.out.println("user : " + user.name + " " + user.surname + "\nStudent Number :"+ user.studentNumber);
	}
	
	
	
	
}