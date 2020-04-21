package com.exp.patterns.observer;

public class StockMarket {

	public StockMarket() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		StockBroker stb = new StockBroker();

		StockObserver ob1 = new StockObserver(stb);
		
		
		StockObserver ob2 = new StockObserver(stb);
		
		stb.setApplePrice(10);
		stb.setAtPrice(12);
		stb.setIbmPrice(15);
		
		
	
			
    Thread t1 = new Thread(() -> {
			stb.setApplePrice(133);
			
			stb.setAtPrice(13344);
			stb.setIbmPrice(1445222);
		 
			});
    
    Thread t2 = new Thread(() -> {
		stb.setApplePrice(23);
		stb.setAtPrice(56);
		stb.setIbmPrice(68);
	 
		});
    
    t1.start();
    try {
		t1.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    t2.start();
    
}
}
