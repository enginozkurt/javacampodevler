package business.abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Product;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	double getDiscountedPrice(Product product,Campaign campaign);
	Campaign get(int id);
	List<Campaign> getAll();
}
