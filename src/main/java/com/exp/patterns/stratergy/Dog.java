package com.exp.patterns.stratergy;

public class Dog extends Animal {

	public Dog() {

		super.setColor("black");
		super.setFood("Meat");
		super.setFlyType(new CantFly());
	}

}
