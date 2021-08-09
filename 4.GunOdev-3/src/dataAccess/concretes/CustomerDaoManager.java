package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerDaoManager implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Kullanici eklendi Id:"+ customer.getId() + " Ýsim :"+customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("kullanici bilgileri güncellendi Id:" + customer.getId() + " Ýsim :"+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("kullanici silindi " + customer.getFirstName());
		
	}

	@Override
	public Customer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
