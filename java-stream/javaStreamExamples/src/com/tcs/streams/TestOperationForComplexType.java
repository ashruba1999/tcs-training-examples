package com.tcs.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestOperationForComplexType {
	
	public static void main(String args[]) {
		
		List<Dish> dishes = Dish.getAllDishes();
		
		List<Dish> nonVegList = new ArrayList<Dish>();
		
	for(Dish dish : dishes)
		{
			
			// filter only non veg List
			
			if(dish.getType().equals("Non Veg")) {
				
				nonVegList.add(dish);
			}
		}
		
		printDish(nonVegList);
		
		
		List<Dish> priceList = new ArrayList<Dish>();
		for(Dish dish : nonVegList)
		{
			if(dish.getPrice() <= 250 && dish.getPrice() >= 300)
				
			{
				priceList.add(dish);
			}
	}
	
		System.out.println("Non Veg items");
		printDish(priceList);
		
		Collections.sort(priceList, new Comparator<Dish>() {
			public int compare(Dish d1, Dish d2) {
				return Double.compare(d1.getPrice(), d2.getPrice());
			}
		});
		
		System.out.println("Sorted Items");
		printDish(priceList);
	
	
	
	}

	private static void printDish(List<Dish> dishes) {
		// TODO Auto-generated method stub
		for(Dish dish : dishes)
			
			System.out.println(dish);
		
		System.out.println("-----------------");
		
	}

	
	}
