package business.concretes;

import business.abstracts.CheckService;

public class checkManager implements CheckService{

	@Override
	public boolean checkEmail(String email) {
		
		return true;
		
	}

}
