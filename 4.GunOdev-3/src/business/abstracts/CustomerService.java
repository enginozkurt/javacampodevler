package business.abstracts;

import java.util.List;

import entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	
	Customer get(int id);
	List<Customer> getAll();
}
