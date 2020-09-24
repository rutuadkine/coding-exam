package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.Collections;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;

public class CollectionBackedDao implements SalesDao{

	private static ArrayList<FoodItems> arrayFood = new ArrayList<FoodItems>();
	private static ArrayList<Electronics> arrayEle = new ArrayList<Electronics>();
	private static ArrayList<Apparel> arrayApparel = new ArrayList<Apparel>();
	@Override
	public FoodItems store(FoodItems item) {
		arrayFood.add(item);
		return null;
	}

	@Override
	public FoodItems[] fetchRecordsFood() {
		FoodItems[] allUser=new FoodItems[arrayFood.size()];
		allUser = arrayFood.toArray(allUser);
		return allUser;
	}

	@Override
	public ArrayList<FoodItems> sortByQuantityFood() {
		Collections.sort(arrayFood);
		FoodItems[] allUser=new FoodItems[arrayFood.size()];
		allUser = arrayFood.toArray(allUser);
		ArrayList<FoodItems> newList = new ArrayList<FoodItems>();
		for(int i=0;i<3;i++)
		{
			newList.add(allUser[i]);
		}
		return newList;
	}

	@Override
	public Electronics store(Electronics item) {
		arrayEle.add(item);
		return null;
	}

	@Override
	public Electronics[] fetchRecordsEle() {
		Electronics[] allUser=new Electronics[arrayEle.size()];
		allUser = arrayEle.toArray(allUser);
		return allUser;
	}

	@Override
	public ArrayList<Electronics> sortByQuantityEle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Apparel store(Apparel item) {
		arrayApparel.add(item);
		return null;
	}

	@Override
	public Apparel[] fetchRecordsApparel() {
		Apparel[] allUser=new Apparel[arrayApparel.size()];
		allUser = arrayApparel.toArray(allUser);
		return allUser;
	}

	@Override
	public ArrayList<Apparel> sortByQuantityApparel() {
		// TODO Auto-generated method stub
		return null;
	}

}
