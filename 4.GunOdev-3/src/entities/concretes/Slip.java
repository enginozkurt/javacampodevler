package entities.concretes;

import entities.abstracts.Entity;

public class Slip implements Entity{
	private int id;
	private String slipNumber;
	private int customerId;
	private int productId;
	public Slip(int id, String slipNumber, int customerId, int productId) {
		super();
		this.id = id;
		this.slipNumber = slipNumber;
		this.customerId = customerId;
		this.productId = productId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSlipNumber() {
		return slipNumber;
	}
	public void setSlipNumber(String slipNumber) {
		this.slipNumber = slipNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
}
