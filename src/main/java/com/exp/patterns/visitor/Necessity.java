package com.exp.patterns.visitor;

public class Necessity implements Visitable{

	double price;

	public Necessity(double price) {
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
