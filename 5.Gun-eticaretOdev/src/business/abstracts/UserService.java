package business.abstracts;

public interface UserService {
	void saveUser(String eMail,String name, String lastName,String password1,String password2);
	void loginUser(String email,String password);
}
