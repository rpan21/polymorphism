package com.training.domains;
import com.training.ifaces.Automobile;

public class ShowRoom {

	public Automobile getItem(int key)
	{
		switch(key){
		
		case 1:
			return new PassengerCar();
			
		case 2:
			return new LuxuryCar();
		case 3:
			return new SportsCar();
			default:
				return null;
				
		}
	}
	
	public void printQuote(Automobile polyauto)
	{
		System.out.println("------------Quotation----------");
		System.out.println("Model : "+ polyauto.getmodel());
		System.out.println("Color : "+polyauto.getcolor());
		System.out.println("Price : "+polyauto.getprice());
		
	}
	
	
	
}
