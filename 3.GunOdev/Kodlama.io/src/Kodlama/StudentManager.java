package Kodlama;

public class StudentManager extends UserManager{
	
	@Override
	public void addUser(Student student) {
		
		super.addUser(student);
		System.out.println("Student Manager");
		
	}
}
