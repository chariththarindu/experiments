package com.exp.patterns.observer;

public interface Subject {
	
	public void register(Observer ob);
	
	public void unregister(Observer ob);
	
	public void notifyObservers();

}
