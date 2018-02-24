package com.decoratorDP;

public class Chocolate extends CoffeeDecorator {

	private CoffeeBase coffeeBase;
	
	public Chocolate(CoffeeBase coffeeBase) {
		this.coffeeBase=coffeeBase;
		description="Chocolate";
	}

	@Override
	public String getDescription() {
		
		return coffeeBase.getDescription() +" is added with "+ description;
	}

	@Override
	public double getCost() {
		
		return coffeeBase.getCost()+10;
	}
	
	
}
