package com.exp.patterns.stratergy;

public interface Fly {

	public void executeFly();
}


class CanFly implements Fly {

	@Override
	public void executeFly() {
		
		System.out.println("I can fly....");
	}
	
}

class CantFly implements Fly {

	@Override
	public void executeFly() {
		
		System.out.println("I cant fly....");
		
	}
	
}