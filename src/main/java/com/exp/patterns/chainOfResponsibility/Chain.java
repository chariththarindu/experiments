package com.exp.patterns.chainOfResponsibility;

public interface Chain {

	public void setNextChain(Chain nextChain);
	
	public void calculate(Numbers request);
	
}
