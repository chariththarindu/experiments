package com.exp.patterns.stratergy;

public class Bird extends Animal{

	public Bird() {
		
		super.setColor("green");
		super.setFood("leaves..");
		super.setFlyType(new CanFly());
	}

}
