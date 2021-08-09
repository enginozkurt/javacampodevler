package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService checkService ;
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		
		this.checkService = checkService;
	}
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		if (checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Hata");
		}
		
	}

	
	
}
