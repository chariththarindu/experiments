package com.exp.patterns.visitor;

public interface Visitor {
	
	public double visit(Liquor liquor);
	public double visit(Tobacco tobacco);
	public double visit(Necessity necessity);

}
