package com.hsbc.model.bussiness;

import java.util.ArrayList;

import com.hsbc.model.beans.FoodItems;

public interface SalesService {
	
	public FoodItems storeUser(FoodItems item);
	public FoodItems[] fetchRecords();
	public ArrayList<FoodItems> topThree();

}
