package com.exp.patterns.state;

public class StateTest {

	public static void main(String[] args) {
		ATMMachine atm = new ATMMachine();

		atm.insertCard();
		atm.ejectCard();
		atm.insertCard();
		atm.insertPin(123);
		atm.requestCash(2000);
		
		atm.insertCard();
		atm.insertPin(123);
		
	}

}
