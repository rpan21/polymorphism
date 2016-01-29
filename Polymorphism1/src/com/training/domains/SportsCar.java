package com.training.domains;
import com.training.ifaces.Automobile;

public class SportsCar implements Automobile {

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "blue";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 2012000;
	}

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "Ferrari f6";
	}

}
