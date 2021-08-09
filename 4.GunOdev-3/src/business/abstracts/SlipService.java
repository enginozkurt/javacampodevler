package business.abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Product;
import entities.concretes.Slip;
	
public interface SlipService {
	
	
	void sale(Product product,Customer customer,Campaign campaign);
	void update(Slip slip);
	void delete(Slip slip);
	
	Slip get(int id);
	List<Slip> getAll();
}
