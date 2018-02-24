package com.decoratorDP;

public class Capuchino extends Coffee{

	public Capuchino() {
		description="Capuchino";
	}

	@Override
	public String getDescription() {
		
		return description;
	}

	@Override
	public double getCost() {
		
		return 20;
	}
	
	
}
