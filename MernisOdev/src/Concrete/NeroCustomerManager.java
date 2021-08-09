package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	private CustomerCheckService checkService ;
public NeroCustomerManager(CustomerCheckService checkService) {
		super();
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
