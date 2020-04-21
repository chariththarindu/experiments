package com.exp.patterns.observer;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double applePrice;
	private double atPrice;
	private StockBroker stBroker;

	private static int observerTracker = 0;

	private int observerId;

	public StockObserver(StockBroker stBroker) {

		this.stBroker = stBroker;
		this.observerId = ++observerTracker;
		System.out.println(" stock observer created :- " + observerId);
		stBroker.register(this);
	}

	@Override
	public void update(double ibmPrice, double applePrice, double atPrice) {
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.atPrice = atPrice;
		
		printPrices();
	}

	private void printPrices() {
		System.out.println("Observer Id :-" + this.observerId);
		System.out.println( " ibm :-" + ibmPrice + " apple :-" + applePrice + "atPrice :-" + atPrice);
	}
	
}
