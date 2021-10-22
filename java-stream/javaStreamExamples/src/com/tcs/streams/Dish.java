package com.tcs.streams;

import java.util.ArrayList;
import java.util.List;

public class Dish {

		private String name;
		private String type;
		private double price;
		public Dish(String name, String type, double price) {
			super();
			this.name = name;
			this.type = type;
			this.price = price;
			
		}
		@Override
		public String toString() {
			return "Dish [name=" + name + ", type=" + type + ", price=" + price + "]";
			
			
		
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		public static List<Dish> getAllDishes(){
			
			List<Dish> list = new ArrayList<Dish>();
			
			// veg items
			
			list.add(new Dish("Fried Rice","Veg",150));
			list.add(new Dish("Roti","Veg",180));
			list.add(new Dish("rajma","Veg",200));
			list.add(new Dish("Aloo","Veg",250));
			list.add(new Dish("panir","Veg",100));
			
			
			// non veg item
			
			list.add(new Dish("Kalmi Kabab","Non Veg",300));
			list.add(new Dish("Kabab","Non Veg",250));
			list.add(new Dish("chikan","Non Veg",150));
			list.add(new Dish("fish","Non Veg",280));
			list.add(new Dish("chikan","Non Veg",160));
			
			return list;
			
		}
		
		
		
}
