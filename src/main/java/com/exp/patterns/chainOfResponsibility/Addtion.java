package com.exp.patterns.chainOfResponsibility;

public class Addtion implements Chain {

	private Chain nextChain;

	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {

		if (request.getCalcMethod() == "add") {
			System.out.println(request.getNumebr1() + " + " + request.getNumber2() + " = " + (request.getNumebr1()
					+ request.getNumber2()));
			return;
		}

		nextChain.calculate(request);

	}

}
