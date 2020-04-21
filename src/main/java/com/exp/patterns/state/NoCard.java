package com.exp.patterns.state;

public class NoCard implements ATMState {

	ATMMachine atmMachine;
	
	
	public NoCard(ATMMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("YOU cant enter more than one card..");
		atmMachine.setAtmstate(atmMachine.getYesCardState());

	}

	@Override
	public void ejectCard() {
		System.out.println("enter card first..");

	}

	@Override
	public void insertPin(int pin) {
		System.out.println("enter card first..");

	}

	@Override
	public void requestCash(int cashAmount) {
		System.out.println("enter card first..");

	}

}
