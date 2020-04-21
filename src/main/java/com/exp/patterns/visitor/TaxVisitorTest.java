package com.exp.patterns.visitor;

public class TaxVisitorTest {

	public static void main(String[] args) {
		TaxVisitor tax = new TaxVisitor();
		
		Liquor l = new Liquor(10.00);
		Tobacco t = new Tobacco(20.00);
		Necessity n = new Necessity(30.00);
		
		System.out.println("liquor price :-" + l.accept(tax));
		System.out.println("tobaco price :-" + t.accept(tax));
		System.out.println("necessit price :-" + n.accept(tax));

	}

}
