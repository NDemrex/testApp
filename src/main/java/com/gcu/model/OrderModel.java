package com.gcu.model;

public class OrderModel {

	Long id = 0L;
	String OrderNo ="";
	String ProductName ="";
	float price =0;
	int quantity = 0;
	
	public OrderModel(Long id, String orderNo, String productName, float price, int quantity) {
		super();
		this.id = id;
		OrderNo = orderNo;
		ProductName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return OrderNo;
	}
	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
