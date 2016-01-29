package com.training.domains;
import com.training.ifaces.Automobile;

public class PassengerCar implements Automobile {

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "grey";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "alto";
	}

}
