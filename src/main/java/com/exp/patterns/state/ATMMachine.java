package com.exp.patterns.state;

public class ATMMachine {

	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmstate;
	
	int cashInMachine= 2000;
	boolean hasCorrectPinEntered = false;
	public ATMMachine() {
	
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		atmstate = noCard;
		
		if(cashInMachine < 0) {
			atmstate = atmOutOfMoney;
		}
	}
	
	void setAtmstate(ATMState atmstate) {
		this.atmstate = atmstate;
	}
	
	public void setCashInMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
	}
	
	public void insertCard() {
		atmstate.insertCard(); 
	}
	
	public void ejectCard() {
		atmstate.ejectCard();
	}
	
	public void insertPin(int pin) {
		atmstate.insertPin(pin);
	}
	
	public void requestCash(int cashAmount) {
		atmstate.requestCash(cashAmount);
	}

	public ATMState getYesCardState() {
		return hasCard;
	}

	public ATMState getNoCardState() {
		return noCard;
	}

	public ATMState getHasPin() {
		return hasCorrectPin;
	}

	public ATMState getnoCashState() {
		return atmOutOfMoney;
	}
	
	
}
