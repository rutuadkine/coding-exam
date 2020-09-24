package com.hsbc.model.beans;

public class Electronics implements Comparable<Electronics>{
	
	private int itemCode;
	private String itemName;
	private double price;
	private int warranty;
	private int quantity;
	
	public Electronics(int itemCode, String itemName, double price, int warranty, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.warranty = warranty;
		this.quantity = quantity;
	}

	public Electronics() {
		super();
	}

	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price + ", warranty="
				+ warranty + ", quantity=" + quantity + "]";
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Electronics o) {
		if(quantity==o.quantity)  
			return 0;  
			else if(quantity>o.quantity)  
			return 1;  
			else  
			return -1; 
	}
	
	
	
	

}
