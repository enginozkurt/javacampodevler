package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class ProductDaoManager implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("�r�n eklendi " + product.getProductName());
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}