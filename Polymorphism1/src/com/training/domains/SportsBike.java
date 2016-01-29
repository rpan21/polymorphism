package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsBike implements Automobile {

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "blue";
		
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 3400000;
	}

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "Stunner";
	}

}
