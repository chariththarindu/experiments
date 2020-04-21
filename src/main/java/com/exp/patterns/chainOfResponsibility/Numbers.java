package com.exp.patterns.chainOfResponsibility;

public class Numbers {

	private int numebr1;
	private int number2;
	
	private String calcMethod;

	public Numbers(int numebr1, int number2, String calcMethod) {
		super();
		this.numebr1 = numebr1;
		this.number2 = number2;
		this.calcMethod = calcMethod;
	}

	public int getNumebr1() {
		return numebr1;
	}

	public int getNumber2() {
		return number2;
	}

	public String getCalcMethod() {
		return calcMethod;
	}
	
	
	
}
