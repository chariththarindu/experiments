package com.exp.patterns.visitor;

public class Liquor implements Visitable{

	double price;

	public Liquor(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public double accept(Visitor visitor) {
		
		return visitor.visit(this);
	}
	
	
}
