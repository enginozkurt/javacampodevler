package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;
import entities.concretes.Product;

public class CampaignDaoManager implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Campaign get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getDiscountedPrice(Product product, Campaign campaign) {
		
		return product.getUnitPrice() + (campaign.getDiscount() *  10 / 100); 
	}

}
