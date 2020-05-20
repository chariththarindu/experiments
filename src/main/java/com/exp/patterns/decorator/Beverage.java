package com.exp.patterns.decorator;

public abstract class Beverage {
	
	String description = "Some Beverage";
		
	protected String getDescription() {
		return description;
	}

	public abstract Double cost() ;

}
