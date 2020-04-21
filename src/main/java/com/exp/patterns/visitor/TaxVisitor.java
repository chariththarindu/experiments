package com.exp.patterns.visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.00");

	public TaxVisitor() {
		super();

	}

	@Override
	public double visit(Liquor liquor) {
		System.out.println("this is liquor..");
		return Double.parseDouble(df.format(liquor.getPrice() * 0.18 + liquor.getPrice()));
	}

	@Override
	public double visit(Tobacco tobacco) {
		System.out.println("this is tobaco..");
		return Double.parseDouble(df.format(tobacco.getPrice() * 0.20 + tobacco.getPrice()));
	}

	@Override
	public double visit(Necessity necessity) {
		System.out.println("this is necessity..");
		return Double.parseDouble(df.format(necessity.getPrice() * 0.30 + necessity.getPrice()));
	}

}
