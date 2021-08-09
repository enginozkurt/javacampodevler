package business.concretes;

import java.util.List;

import business.abstracts.CustomerService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerDao customerDao ;
	public CustomerManager(CustomerDao customerDao) {
		
		this.customerDao = customerDao;
	}

	@Override
	public void add(Customer customer) {
		this.customerDao.add(customer);
		
	}

	@Override
	public void update(Customer customer) {
		this.customerDao.update(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		this.customerDao.delete(customer);
		
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
