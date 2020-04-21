package com.exp.patterns.chainOfResponsibility;

public class TestChain {

	public static void main(String[] args) {
		
		Numbers request = new Numbers(1, 2, "g");
		Chain add = new Addtion();
		Chain sub = new Subtraction();
		Chain mul = new Multiply();
		Chain div = new Division();
		
		add.setNextChain(sub);
		sub.setNextChain(mul);
		mul.setNextChain(div);
		
		add.calculate(request);

	}

}
