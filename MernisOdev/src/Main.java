import java.rmi.RemoteException;
import java.sql.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		BaseCustomerManager manager = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager manager2 = new NeroCustomerManager(new MernisServiceAdapter());
		manager.save(new Customer(1,"ENGÝN","ÖZKURT",new Date(1982,01,01),"123456789"));
		manager.save(new Customer(1,"hýzýr ENGÝN","ÖZKURT",new Date(1982,01,01),"123456789"));
	}

}
