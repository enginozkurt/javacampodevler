package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Customer;
import entities.concretes.Product;
import entities.concretes.Slip;

public interface SlipDao {
	void add(Slip slip,Product product,Customer customer);
	void update(Slip slip);
	void delete(Slip slip);
	
	Slip get(int id);
	List<Slip> getAll();
}
