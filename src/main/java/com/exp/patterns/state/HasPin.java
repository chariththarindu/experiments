package com.exp.patterns.state;

public class HasPin implements ATMState {

	ATMMachine atmMachine;
	
	
	public HasPin(ATMMachine atmMachine) {
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
		System.out.println("YOU cant enter more than one pin...");

	}

	@Override
	public void requestCash(int cashAmount) {
		if( cashAmount > atmMachine.cashInMachine) {
			System.out.println("not enough cash...");
			ejectCard();
		} else {
			System.out.println("cache provided..=" + cashAmount);
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashAmount);
			ejectCard();
			
			if( atmMachine.cashInMachine <= 0) {
				atmMachine.setAtmstate(atmMachine.getnoCashState());
			}
		}
	}

}
