package com.decoratorDP;

public class DecoratorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coffee expresso=new Expresso();
		CoffeeDecorator milk=new Milk(expresso);
		CoffeeDecorator chocolate =new Chocolate(milk);

		System.out.println(chocolate.getDescription());
		System.out.println(chocolate.getCost());
	}

}
