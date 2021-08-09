package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.SlipDao;
import entities.concretes.Customer;
import entities.concretes.Product;
import entities.concretes.Slip;

public class SlipDaoManager implements SlipDao{

	@Override
	public void add(Slip slip,Product product,Customer customer) {
		System.out.println("Fatura Eklendi " + "Fatura no:"+slip.getSlipNumber()+" Ürün :"+ product.getProductName()+" Müþteri:"+ customer.getFirstName() );
		
	}

	@Override
	public void update(Slip slip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Slip slip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Slip get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Slip> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
