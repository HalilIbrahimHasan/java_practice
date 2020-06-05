package day_10;

public class CarRunner {

	/*
	Bir class olusturunuz adi Honda olsun
	icerisinde 3 instance variable olsun 
	protected String make = "Honda";
	protected String model = "Accord";
	protected int year = 2012;
	
	Sonra 3 tane String return tipinden method olusturunuz
	
	arabaMarkasi
	arabaModeli
	arabaYili
	
	Son olarak bir oject olusturup method lari main method da print ediniz 
	*/
	
	
	
	
	public static void main(String[] args) {
	//reference type   Object type
		Car car1   =   new Honda();
		Car car2   =   new Toyota();
		
		Car car3   =   new Honda("Civic",2020,33000);
		
		System.out.println("=======Honda===========");
		System.out.println(car3.carMake());
		System.out.println(car3.carModel());
		System.out.println(car3.carYear());
		System.out.println(car3.carPrice());
		
		System.out.println(car1.carMake());
		System.out.println(car1.carModel());
		System.out.println(car1.carYear());
		System.out.println(car1.carPrice());
		System.out.println("=======Toyota===========");
		
		
		
//		
//		System.out.println(car1.carMake());
//		System.out.println(car2.carMake());
	}
	
}
