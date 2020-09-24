package com.hsbc.controller;

import java.time.LocalDate;
import java.util.Scanner;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.FoodItems;
//import com.hsbc.exception.ItemNotFoundException;
import com.hsbc.model.bussiness.SalesService;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class MainViewController {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		// This is getting service object
		LocalDate ld;
		SalesService service = (SalesService) UserFactory.getInstance(Type.SERVICE);
		int option = 0,choice=0;
		do {
			System.out.println("*****************************************************************************************");
			System.out.println("Enter 1.FoodItems 2.Apparel  3.Electronics");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 2:
				System.out.println("Enter 1:Enter data 2:View Data  3:Top 3 sale");
				option=scanner.nextInt();
				switch(option)
				{
				case 1:
					Apparel app = new Apparel(101,"abc",100.0,10,"Cotton",5);
					
				}
				
				
			}
		} while(option != 4);
		
		scanner.close();
	}

	

}

