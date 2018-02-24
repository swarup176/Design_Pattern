package com.decoratorDP;

public class Expresso extends Coffee{

	public Expresso() {
		description="Expresso";
	}

	@Override
	public String getDescription() {
		
		return description;
	}

	@Override
	public double getCost() {
		
		return 10;
	}
	
	
}
