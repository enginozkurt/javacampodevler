package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.CheckService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import eticaretOdev.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private CheckService checkService;
	private int id = 0;
	public UserManager(UserDao userDao,CheckService checkService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
	}
	
	@Override
	public void saveUser(String eMail, String name, String lastName, String password1, String password2) {
		if (password1.equals(password2)   ) {
			if (password1.length()== 6) {
				if ( checkService.checkEmail(eMail)) {
					if ( name.length() > 2 && lastName.length()>2) {
						String regex = "^(.+)@(.+)$";
						Pattern pattern = Pattern.compile(regex);
						Matcher matcher = pattern.matcher(eMail);
						if (matcher.matches()) {
							User user = new User(++id,name,lastName,eMail,password1);
							this.userDao.add(user);
						} else {System.out.println("Email formata uygun olmalý");}
						
					} else {System.out.println("Ýsim / soyisim 2 karakterden kýsa olamaz");}
				} else {System.out.println("Email kayýtlý");}			
			} else {System.out.println("þifre minimum 6 karakterli olmalý");}
			
			
		} else{System.out.println("Girilen þifreler birbiriyle ayný olmalýdýr");}
		
	}

	@Override
	public void loginUser(String email, String password) {
		System.out.println(email+ " giris yaptý");
		
	}

}
