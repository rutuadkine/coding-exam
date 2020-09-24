package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;

public interface SalesDao {
	
	public FoodItems store(FoodItems item);
	public FoodItems[] fetchRecordsFood();
	public ArrayList<FoodItems> sortByQuantityFood();
	
	public Electronics store(Electronics item);
	public Electronics[] fetchRecordsEle();
	public ArrayList<Electronics> sortByQuantityEle();
	
	
	
	public Apparel store(Apparel item);
	public Apparel[] fetchRecordsApparel();
	public ArrayList<Apparel> sortByQuantityApparel();
	
	

}
