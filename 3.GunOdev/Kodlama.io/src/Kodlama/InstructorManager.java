package Kodlama;

public class InstructorManager extends UserManager{
	
	@Override
	public void addUser(Instructor instructor) {
		
		super.addUser(instructor);
		System.out.println("Instructor Manager");
	}
}
