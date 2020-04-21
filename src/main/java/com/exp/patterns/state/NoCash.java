package com.exp.patterns.state;

public class NoCash implements ATMState {

	ATMMachine atmMachine;
	
	
	
	public NoCash(ATMMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("NO money.....");

	}

	@Override
	public void ejectCard() {
		System.out.println("you ddint enter the card.....");

	}

	@Override
	public void insertPin(int pin) {
		System.out.println("NO money.....");

	}

	@Override
	public void requestCash(int cashAmount) {
		System.out.println("NO money.....");
	}

}
