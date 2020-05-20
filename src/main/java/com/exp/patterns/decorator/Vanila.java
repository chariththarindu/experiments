package com.exp.patterns.decorator;

public class Vanila extends BeverageDecorator{

	private Beverage beverage;
	
	public Vanila(Beverage beverage) {
		super();
		this.beverage = beverage;
		super.description = beverage.getDescription() + "added Vanila";
		
	}

	@Override
	public Double cost() {
		return this.beverage.cost() + 0.50;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
