package com.exp.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements Subject {

	List<Observer> observerList = new ArrayList<Observer>();
	double ibmPrice;
	double applePrice;
	double atPrice;

	public StockBroker() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(Observer ob) {
		observerList.add(ob);

	}

	@Override
	public void unregister(Observer ob) {
		int index = observerList.indexOf(ob);
		observerList.remove(ob);
		System.out.println("removed index:-" + index + 1);

	}

	@Override
	public void notifyObservers() {

		observerList.parallelStream().forEach(x -> x.update(ibmPrice, applePrice, atPrice));
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}

	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
		notifyObservers();
	}

	public void setAtPrice(double atPrice) {
		this.atPrice = atPrice;
		notifyObservers();
	}

	
}
