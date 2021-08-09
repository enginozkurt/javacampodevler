package business.concretes;

import business.abstracts.ValidationService;
import eticaretOdev.entities.concretes.User;

public class ValidationManager implements ValidationService{

	@Override
	public void validateUser(User user) {
		System.out.println(user.getName()+" aktive edildi.");
		
	}

}
