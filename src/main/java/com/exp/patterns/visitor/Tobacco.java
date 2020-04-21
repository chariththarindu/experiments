package com.exp.patterns.visitor;

public class Tobacco implements Visitable{

	double price;

	public Tobacco(double price) {
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
