package com.xworkz.corejava.Collection_Framework.List.Linked_List.LinkedList_Assignment;

public class HandBag {
	
		private	String Brand;
		private	double price;
		private	String color;
			
		HandBag(){
			  
		  }

		
		public String getBrand() {
			return Brand;
		}


		public void setBrand(String brand) {
			Brand = brand;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		@Override
		public String toString() {
			return "HandBag [Brand=" + Brand + ", price=" + price + ", color=" + color + "]";
		}			
		}


