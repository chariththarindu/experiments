package com.exp.patterns.stratergy;

public class AnimalStratergy {

	public static void main(String[] args) {
		Animal blacky = new Dog();
		Animal tweety = new Bird();
		
		blacky.getFlyType().executeFly();
		
		tweety.getFlyType().executeFly();
	}

}
