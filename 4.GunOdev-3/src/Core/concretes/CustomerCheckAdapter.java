package Core.concretes;

import Core.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class CustomerCheckAdapter implements CustomerCheckService{

	@Override
	public void customerCheck(Customer customer) {
		CheckCustomerId checkCustomer = new CheckCustomerId();
	boolean check =	checkCustomer.CheckPerson(customer.getId(), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
		if (check) {
			System.out.println("Kimlik dogru " + customer.getFirstName());
		}else {
			System.out.println("Kimlik yanlýþ " + customer.getFirstName());
		}
	}

}
