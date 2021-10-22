package com.tcs.streams;

import java.util.List;
import java.util.stream.Collectors;

public class TestStreamForComplexOperation {
	
	public static void main(String args[])
	{
		
		List<Dish> dishes = Dish.getAllDishes();
		
		List<Dish> nonVegList = dishes.stream().filter(dish -> dish.getType().equals("Non Veg")).collect(Collectors.toList());
		
    System.out.println("Show only Non veg Items");
    
    printDish(nonVegList);
		
    List<Dish> priceList = nonVegList.stream().filter(dish -> dish.getPrice() >=150 && dish.getPrice() <=200).collect(Collectors.toList());
    System.out.println("show filter non veg dishes");
    printDish(priceList);
    
    
    
    List<Dish> sortedList = priceList.stream()
			.sorted((d1, d2) -> Double.compare(d1.getPrice(), d2.getPrice())).collect(Collectors.toList());
	System.out.println("----- Show items in sorted order -------");
	
	printDish(sortedList);
	
   
   
   
   
	}

	private static void printDish(List<Dish> dishes) {
		
		// TODO Auto-generated method stub
	
		for(Dish dish : dishes)
		{
			System.out.println(dish);
			System.out.println("--------------------");
		}
	}

}
