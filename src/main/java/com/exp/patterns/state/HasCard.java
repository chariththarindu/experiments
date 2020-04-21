package com.exp.patterns.state;

public class HasCard implements ATMState {

	ATMMachine atmMachine;
	
	
	public HasCard(ATMMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("YOU cant enter more than one card..");

	}

	@Override
	public void ejectCard() {
		System.out.println("card ejected....");
		atmMachine.setAtmstate(atmMachine.getNoCardState());

	}

	@Override
	public void insertPin(int pin) {
		if(pin == 123) {
			System.out.println("correct pin....");			
			atmMachine.hasCorrectPinEntered = true;
			atmMachine.setAtmstate(atmMachine.getHasPin());
		}else {
			System.out.println("wrong pin....");			
			atmMachine.hasCorrectPinEntered = false;
			ejectCard() ;
			//System.out.println("card ejected....");
			//atmMachine.setAtmstate(atmMachine.getNoCardState());
		}

	}

	@Override
	public void requestCash(int cashAmount) {
		System.out.println("enter pin first....");

	}

}
