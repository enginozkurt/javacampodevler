

import business.abstracts.UserService;
import business.concretes.UserManager;
import business.concretes.checkManager;

import dataAccess.concretes.UserDaoManager;


public class Main {

	public static void main(String[] args) {
		
		UserService userManager = new UserManager(new UserDaoManager(), new checkManager());
		userManager.saveUser("engin@mail.com", "engin","ozkurt" , "123456", "123456");
		userManager.saveUser("test@mail.com", "test","t" , "123456", "123456");
		userManager.saveUser("mahmut@mail.com", "mahmut","mahmut" , "123456", "12345");
		userManager.saveUser("mahmut@mail.com", "mahmut","mahmut" , "12345", "12345");
		userManager.saveUser("mahmut@mail.com", "mahmut","mahmut" , "123456", "123456");
		userManager.saveUser("mahmut$mail.com", "mahmut","mahmut" , "123456", "123456");
		
		userManager.loginUser("engin@mail.com", "123456");
	}

}
