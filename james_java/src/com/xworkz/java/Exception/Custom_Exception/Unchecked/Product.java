package com.xworkz.java.Exception.Custom_Exception.Unchecked;

public class Product {
	private String productName;
	private int price;
	
	public Product(String productName,int price) {
	this.productName = productName;
	this.price = price;

}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [productname=" + productName + ",price=" + price + "]";
	}
}
	
