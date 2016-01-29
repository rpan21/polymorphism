package com.training.domains;
import com.training.ifaces.Automobile;

public class LuxuryCar implements Automobile {

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "white";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 800000;
	}

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "Ambassador";
	}

}
