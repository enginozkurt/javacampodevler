package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import business.abstracts.SlipService;
import dataAccess.abstracts.SlipDao;
import dataAccess.concretes.CampaignDaoManager;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Product;
import entities.concretes.Slip;

public class SlipManager implements SlipService{
	CampaignService campaignService = new CampaignManager(new CampaignDaoManager());
	SlipDao slipDao ;
	public SlipManager(SlipDao slipDao) {
		
		this.slipDao = slipDao;
	}

	@Override
	public void sale(Product product,Customer customer,Campaign campaign) {
		Slip slip = new Slip(1,"00001",customer.getId(),product.getId());
		slipDao.add(slip,product,customer);
		
	}

	@Override
	public void update(Slip slip) {
		slipDao.update(slip);
		
	}

	@Override
	public void delete(Slip slip) {
		slipDao.delete(slip);
		
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
