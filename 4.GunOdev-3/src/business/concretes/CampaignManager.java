package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;
import entities.concretes.Product;

public class CampaignManager implements CampaignService {
	CampaignDao campaignDao;
	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDao.add(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		campaignDao.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDao.delete(campaign);
		
	}

	@Override
	public double getDiscountedPrice(Product product, Campaign campaign) {
		
		return campaignDao.getDiscountedPrice(product, campaign);
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
	
}
