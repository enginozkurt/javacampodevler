package business.concretes;

import java.util.List;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class ProductManager implements ProductService{

	ProductDao productDao;
	public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		this.productDao.add(product);
		
	}

	@Override
	public void update(Product product) {
		this.productDao.update(product);
		
	}

	@Override
	public void delete(Product product) {
		this.productDao.delete(product);
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
