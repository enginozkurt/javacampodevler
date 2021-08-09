package Kodlama;

public class Student extends User{
	String studentNumber;
	
	public Student(int id, String name, String surname, String citizenNumber, String email, String phoneNumber,String studentNumber) {
		super(id, name, surname, citizenNumber, email, phoneNumber);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}


}
