package com.exp.patterns.decorator;

public class Tea extends Beverage{
	
	public Tea() {
		super();
		super.description= "tea";
	}

	@Override
	public Double cost() {		
		return 10.50;
	}

}
