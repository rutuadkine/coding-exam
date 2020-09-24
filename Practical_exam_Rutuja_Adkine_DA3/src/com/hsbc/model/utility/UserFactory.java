package com.hsbc.model.utility;

import com.hsbc.model.bussiness.ServiceImpl;
import com.hsbc.model.dao.CollectionBackedDao;

public class UserFactory {
	
	public static Object getInstance(Type type)
	{
		Object obj = null;
		switch(type)
		{
		case DAO:
			obj = new CollectionBackedDao();
			break;
		case SERVICE:
			obj = new ServiceImpl();
			break;
		}
		return obj;
	}
}
