package Kodlama;


public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Engin","Ozkurt","123456","test@mail.com","212123456","123");
		Instructor i1 = new Instructor(1, "Test", "User", "1245454", "test2@mail.com","2122321212" , "1", "12343434334");
		User us1 = new User(1, "Test2", "User2", "111111", "test3@mail.com","2122321212");
		UserManager usMan = new UserManager();
		InstructorManager inMan = new InstructorManager();
		StudentManager stMan = new StudentManager();
		
		usMan.addUser(s1);
		usMan.addUser(i1);
		usMan.addUser(us1);
		
		System.out.println("*****************************");
		
		inMan.addUser(i1);
		stMan.addUser(s1);
		System.out.println("*****************************");
		
		usMan.getUser(us1);
		System.out.println("*****************************");
		usMan.getUser(i1);
		System.out.println("*****************************");
		usMan.getUser(us1);	
		System.out.println("*****************************");
		
		
	}

}
