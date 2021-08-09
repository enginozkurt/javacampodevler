package entities.concretes;

import java.util.Date;

import entities.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private int discount;
	private Date campaignStartDate;
	private Date campaignEndDate;
	public Campaign(int id, int discount, Date campaignStartDate, Date campaignEndDate) {
		super();
		this.id = id;
		this.discount = discount;
		this.campaignStartDate = campaignStartDate;
		this.campaignEndDate = campaignEndDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Date getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(Date campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}
	public Date getCampaignEndDate() {
		return campaignEndDate;
	}
	public void setCampaignEndDate(Date campaignEndDate) {
		this.campaignEndDate = campaignEndDate;
	}
	
}
