package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import eticaretOdev.entities.concretes.User;

public class UserDaoManager implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getId()+" "+user.getName()+" eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" silindi");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
