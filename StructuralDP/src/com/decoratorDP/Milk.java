package com.decoratorDP;

public class Milk extends CoffeeDecorator {

	private CoffeeBase coffeeBase;
	
	public Milk(CoffeeBase coffeeBase) {
		this.coffeeBase=coffeeBase;
		description="Milk";
	}

	@Override
	public String getDescription() {
		
		return coffeeBase.getDescription() +" is added with "+ description;
	}

	@Override
	public double getCost() {
		
		return coffeeBase.getCost()+5;
	}
	
	
}
