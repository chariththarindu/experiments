package com.exp.patterns.decorator;

public class Milk extends BeverageDecorator{
	
	private Beverage beverage;	

	public Milk(Beverage beverage) {
		super();
		this.beverage = beverage;
		super.description = this.beverage.description +   "aded milk";
	}

	@Override
	public Double cost() {
		
		return beverage.cost() + 1.25;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + "aded milk";
	}

	
}
