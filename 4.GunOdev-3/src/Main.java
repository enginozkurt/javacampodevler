import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Core.abstracts.CustomerCheckService;
import Core.concretes.CustomerCheckAdapter;
import business.abstracts.CustomerService;
import business.abstracts.SlipService;
import business.concretes.CustomerManager;
import business.concretes.SlipManager;
import dataAccess.concretes.CustomerDaoManager;
import dataAccess.concretes.SlipDaoManager;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Product;

public class Main {

	public static void main(String[] args) throws ParseException {
	  String pattern = "MM-dd-yyyy";
	  SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	  Customer customer = new Customer(1, "123456789", "customer@mail.com", "Engin", "Özkurt",new Date(1982),"123");
	  CustomerService customerService = new CustomerManager(new CustomerDaoManager());
	  SlipService slipService = new SlipManager(new SlipDaoManager());
	  customerService.add(customer);
	  Product product = new Product(1, "God Of War", 1 ,250.0, 1);
	  Campaign campaign = new Campaign(1, 10, simpleDateFormat.parse("12-01-2021") , simpleDateFormat.parse("12-01-2022"));
	  slipService.sale(product, customer,campaign);
	  System.out.println(customer.getFirstName());
	  customer.setFirstName("Mahmut");
	  customerService.update(customer);
	  customerService.delete(customer);
	  
	  CustomerCheckService checkService = new CustomerCheckAdapter();
	  checkService.customerCheck(customer);
	  
	  
	}

}
