package com.hsbc.model.bussiness;

import java.util.ArrayList;

import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.dao.SalesDao;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class ServiceImpl implements SalesService{

	private SalesDao dao;
	public ServiceImpl()
	{
		dao = (SalesDao)UserFactory.getInstance(Type.DAO);
	}
	@Override
	public FoodItems storeUser(FoodItems item) {
		dao.store(item);
		return null;
	}

	@Override
	public FoodItems[] fetchRecords() {
		dao.fetchRecordsFood();
		return null;
	}

	@Override
	public ArrayList<FoodItems> topThree() {
		dao.sortByQuantityFood();
		return null;
	}

}
