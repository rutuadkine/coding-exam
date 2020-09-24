package com.hsbc.model.beans;

public class Apparel implements Comparable<Apparel>{

	private int itemCode;
	private String itemName;
	private double price;
	private int size;
	private String material;
	
	private int quantity;
	public Apparel(int itemCode, String itemName, double price, int size, String material, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.size = size;
		this.material = material;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price + ", size=" + size
				+ ", material=" + material + ", quantity=" + quantity + "]";
	}
	public Apparel() {
		super();
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Apparel o) {
		if(quantity==o.quantity)  
			return 0;  
			else if(quantity>o.quantity)  
			return 1;  
			else  
			return -1; 
	}
	
	
	
	
	
}
