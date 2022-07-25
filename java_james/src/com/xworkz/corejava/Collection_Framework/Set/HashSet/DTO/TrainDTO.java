package com.xworkz.corejava.Collection_Framework.Set.HashSet.DTO;

public class TrainDTO {
	private String name;
	private String Source;
	private String destination;
	private int number;
	private double price;
	private int noofcompartments;
	
	

	public TrainDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoofcompartmnets() {
		return noofcompartments;
	}

	public void setNoofcompartmnets(int noofcompartmnets) {
		this.noofcompartments = noofcompartments;
	}

	@Override
	public String toString() {
		return "TrainDTO [name=" + name + ", Source=" + Source + ", destination=" + destination + ", number=" + number
				+ ", price=" + price + ", noofcompartments=" + noofcompartments + "]";
	}
	
	
	
	

}



