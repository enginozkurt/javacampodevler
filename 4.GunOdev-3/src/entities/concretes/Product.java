package entities.concretes;

import entities.abstracts.Entity;

public class Product implements Entity{
	private	int id;
	private String productName;
	private int categoryId;
	private double unitPrice;
	private int campaignId;

	
	
	public Product(int id, String productName, int categoryId, double unitPrice,int campaignId) {
		
		this.id = id;
		this.productName = productName;
		this.categoryId = categoryId;
		this.unitPrice = unitPrice;
		this.campaignId = campaignId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
