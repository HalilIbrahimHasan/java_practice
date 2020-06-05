package day_10;

public abstract class Car {

//	protected String make;
//	protected String model;
//	protected int year;
//	protected double price;

	public Car() {

	}

	public Car(String model, int year, double price) {
//
//		this.model = model;
//		this.year = year;
//		this.price = price;
	}
	
	
	abstract String carMake();
	abstract String carModel();
	abstract String carYear();
	abstract String carPrice();

	
	
	
	

}
