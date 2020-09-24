package com.hsbc.model.beans;

import java.time.LocalDate;

public class FoodItems implements Comparable<FoodItems>{
	
	private int itemCode;
	private String itemName;
	private double price;
	private LocalDate manufactorDate; 
	private LocalDate expirayDate;
	private String vegOrNonveg;
	private int quantity;
	
	public FoodItems(int itemCode, String itemName, double price, LocalDate manufactorDate, LocalDate expirayDate,
			String vegOrNonveg, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.manufactorDate = manufactorDate;
		this.expirayDate = expirayDate;
		this.vegOrNonveg = vegOrNonveg;
		this.quantity = quantity;
	}

	public FoodItems() {
		super();
	}

	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price + ", manufactorDate="
				+ manufactorDate + ", expirayDate=" + expirayDate + ", vegOrNonveg=" + vegOrNonveg + ", quantity="
				+ quantity + "]";
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

	public LocalDate getManufactorDate() {
		return manufactorDate;
	}

	public void setManufactorDate(LocalDate manufactorDate) {
		this.manufactorDate = manufactorDate;
	}

	public LocalDate getExpirayDate() {
		return expirayDate;
	}

	public void setExpirayDate(LocalDate expirayDate) {
		this.expirayDate = expirayDate;
	}

	public String getVegOrNonveg() {
		return vegOrNonveg;
	}

	public void setVegOrNonveg(String vegOrNonveg) {
		this.vegOrNonveg = vegOrNonveg;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(FoodItems o) {
		if(quantity==o.quantity)  
			return 0;  
			else if(quantity>o.quantity)  
			return 1;  
			else  
			return -1;  
	}
	
	
	
	

}
